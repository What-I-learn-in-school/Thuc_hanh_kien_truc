package adapterPartern.utils;

import java.util.Map;

public class MyXMLConverter {
    public static String toString(MyJSONObject json) {
        return json.toXml();
    }

    public static String toString(Map<String, Object> jsonMap) {
        StringBuilder xmlBuilder = new StringBuilder();
        xmlBuilder.append("<root>");
        convertMapToXml(jsonMap, xmlBuilder);
        xmlBuilder.append("</root>");
        return xmlBuilder.toString();
    }

    private static void convertMapToXml(Map<String, Object> map, StringBuilder xmlBuilder) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            xmlBuilder.append("<").append(entry.getKey()).append(">");

            if (entry.getValue() instanceof Map) {
                convertMapToXml((Map<String, Object>) entry.getValue(), xmlBuilder);
            } else {
                xmlBuilder.append(entry.getValue());
            }

            xmlBuilder.append("</").append(entry.getKey()).append(">");
        }
    }
}