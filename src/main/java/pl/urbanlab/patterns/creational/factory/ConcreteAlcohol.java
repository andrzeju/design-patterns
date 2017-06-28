package pl.urbanlab.patterns.creational.factory;

/**
 * Created by Andrzej on 2017-06-28.
 */
public class ConcreteAlcohol implements Alcohol {
    private final String name;
    private final String strength;

    public ConcreteAlcohol(String name, String strength) {
        this.name = name;
        this.strength = strength;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getStrength() {
        return strength;
    }
}
