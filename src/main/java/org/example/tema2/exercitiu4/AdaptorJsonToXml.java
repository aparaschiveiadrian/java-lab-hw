package org.example.tema2.exercitiu4;

public class AdaptorJsonToXml {
    private SistemExistent sistemExistent;

    public AdaptorJsonToXml(SistemExistent sistemExistent) {
        this.sistemExistent = sistemExistent;
    }

    public void trimiteDate(String json) {
        String xml = transformaJsonInXml(json);
        sistemExistent.afiseazaXML(xml);
    }

    private String transformaJsonInXml(String json) {
        if (json == null || json.isEmpty()) {
            return "<data></data>";
        }

        json = json.replace("{", "")
                .replace("}", "")
                .replace("\"", "");

        String[] elemente = json.split(",");

        StringBuilder xml = new StringBuilder("<data>");

        for (String element : elemente) {
            String[] parts = element.split(":");
            if (parts.length == 2) {
                String key = parts[0].trim();
                String value = parts[1].trim();
                xml.append("<" + key + ">" + value + "</" + key + ">");
            }
        }

        xml.append("</data>");

        return xml.toString();
    }

}