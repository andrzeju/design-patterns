package pl.urbanlab.patterns.creational.factory.aviation;

public class MilitaryHelicopterFactory extends HelicopterFactory {

    @Override
    public Helicopter create(String name) {
        return new MilitaryHelicopter(name, 4, 2);
    }
}
