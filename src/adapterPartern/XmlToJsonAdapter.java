package adapterPartern;

import adapterPartern.utils.MyJSONObject;
import adapterPartern.utils.MyXMLConverter;

public class XmlToJsonAdapter implements JsonService{
    private XmlSystem adaptee;

    public XmlToJsonAdapter(XmlSystem adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void processJson(String jsonData) {
        // Chuyển đổi JSON thành XML
        MyJSONObject json = new MyJSONObject(jsonData);
        String xmlData = MyXMLConverter.toString(json);

        System.out.println("Chuyển đổi JSON -> XML: " + xmlData);

        // Gọi phương thức của hệ thống cũ
        adaptee.processXml(xmlData);
    }
}
