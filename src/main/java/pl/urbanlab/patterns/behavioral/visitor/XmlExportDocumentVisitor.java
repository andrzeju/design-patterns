package pl.urbanlab.patterns.behavioral.visitor;

import java.util.List;

public class XmlExportDocumentVisitor implements Visitor {

    @Override
    public String visitReport(Report report) {
        return "    <report>Report: " + report.getName() + ", no: " + report.getReportNo() + "</report>";
    }

    @Override
    public String visitSpecification(Specification specification) {
        return "    <specification>Spec " + specification.getName() + ", model: " + specification.getEngineModel()
            + "</specification>";
    }

    @Override
    public String visitComponentList(ComponentList componentList) {
        return "    <components>Components " + componentList.getName() + ", elements: "
            + componentList.getPartsAmount() + "</components>";
    }

    @Override
    public void xlmPrintAll(List<Document> documents) {
        System.out.println("<documents>");
        for (Document doc : documents) {
            System.out.println(doc.accept(this));
        }
        System.out.println("</documents>");
    }
}
