package pl.urbanlab.patterns.creational.abstractFactory;

public class Equipment {

    private String name;
    private Integer hitPoints;

    public Equipment(String name, Integer hitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }

    public Integer getHitPoints() {
        return hitPoints;
    }
}
