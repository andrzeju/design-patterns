package pl.urbanlab.patterns.behavioral.visitor;

public class ComponentList implements Document {

    private String name;
    private int partsAmount;

    public ComponentList(String name, int partsAmount) {
        this.name = name;
        this.partsAmount = partsAmount;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitComponentList(this);
    }

    public String getName() {
        return name;
    }

    public int getPartsAmount() {
        return partsAmount;
    }
}
