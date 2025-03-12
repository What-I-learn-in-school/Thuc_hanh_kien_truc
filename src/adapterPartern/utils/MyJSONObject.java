package adapterPartern.utils;

import java.util.HashMap;
import java.util.Map;

public class MyJSONObject {
    private Map<String, Object> data;

    public MyJSONObject(String jsonString) {
        this.data = parseJson(jsonString);
    }

    private Map<String, Object> parseJson(String jsonString) {
        Map<String, Object> map = new HashMap<>();
        jsonString = jsonString.trim();

        // Loại bỏ dấu ngoặc nhọn {}
        if (jsonString.startsWith("{") && jsonString.endsWith("}")) {
            jsonString = jsonString.substring(1, jsonString.length() - 1).trim();
        }

        // Tách các cặp key-value
        String[] pairs = jsonString.split(",");
        for (String pair : pairs) {
            String[] keyValue = pair.split(":");
            if (keyValue.length == 2) {
                String key = keyValue[0].trim().replaceAll("\"", ""); // Xóa dấu ngoặc kép
                String value = keyValue[1].trim().replaceAll("\"", ""); // Xóa dấu ngoặc kép
                map.put(key, isNumeric(value) ? Double.parseDouble(value) : value);
            }
        }
        return map;
    }

    public String toXml() {
        StringBuilder xmlBuilder = new StringBuilder();
        xmlBuilder.append("<root>");
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            xmlBuilder.append("<").append(entry.getKey()).append(">")
                    .append(entry.getValue())
                    .append("</").append(entry.getKey()).append(">");
        }
        xmlBuilder.append("</root>");
        return xmlBuilder.toString();
    }

    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
