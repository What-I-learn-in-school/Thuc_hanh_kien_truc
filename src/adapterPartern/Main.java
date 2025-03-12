package adapterPartern;

public class Main {
    public static void main(String[] args) {
        // Hệ thống cũ chỉ hỗ trợ XML
        XmlSystem xmlSystem = new XmlSystem();

        // Adapter giúp chuyển đổi JSON sang XML
        JsonService jsonService = new XmlToJsonAdapter(xmlSystem);

        // JSON đầu vào (giả lập dữ liệu từ Web Service)
        String jsonData = "{ \"order\": { \"id\": 123, \"amount\": 1000, \"currency\": \"VND\" } }";

        // Dịch vụ web xử lý JSON nhưng thực chất được chuyển đổi sang XML
        jsonService.processJson(jsonData);
    }
}
