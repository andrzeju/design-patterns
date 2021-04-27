package pl.urbanlab.patterns.behavioral.visitor;

import java.util.List;

public class XlsExportDocumentVisitor implements Visitor {

    @Override
    public String visitReport(Report report) {
        return "Report: " + report.getName() + " no: " + report.getReportNo();
    }

    @Override
    public String visitSpecification(Specification specification) {
        return "Spec " + specification.getName() + " model: " + specification.getEngineModel();
    }

    @Override
    public String visitComponentList(ComponentList componentList) {
        return "Components " + componentList.getName() + " elements: " + componentList.getPartsAmount();
    }

    @Override
    public void exportAll(List<Document> documents) {
        for (Document doc : documents) {
            System.out.println(doc.accept(this));
        }
    }
}
