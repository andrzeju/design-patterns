package pl.urbanlab.patterns.behavioral.visitor;

import java.util.List;

public class VisitorClient {

    public static void main(String[] args) {
        Document report = new Report("2021 Financial report", 23);
        Document spec = new Specification("Engine specification", "T1000");
        Document components = new ComponentList("Engine parts", 20);

        List<Document> documents = List.of(report, spec, components);

        Visitor visitor = new XmlExportDocumentVisitor();

        visitor.xlmPrintAll(documents);
    }
}
