package pl.urbanlab.patterns.behavioral.visitor;

public class Specification implements Document {

    private String name;
    private String engineModel;

    public Specification(String name, String engineModel) {

        this.name = name;
        this.engineModel = engineModel;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitSpecification(this);
    }

    public String getName() {
        return name;
    }

    public String getEngineModel() {
        return engineModel;
    }
}
