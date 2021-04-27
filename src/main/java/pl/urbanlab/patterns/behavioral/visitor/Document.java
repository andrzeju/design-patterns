package pl.urbanlab.patterns.behavioral.visitor;

public interface Document {

    String accept(Visitor visitor);

}
