package pl.urbanlab.patterns.behavioral.visitor;

import java.util.List;

public interface Visitor {

    String visitReport(Report report);

    String visitSpecification(Specification specification);

    String visitComponentList(ComponentList componentList);

    void xlmPrintAll(List<Document> documents);
}
