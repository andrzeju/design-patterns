package pl.urbanlab.patterns.creational.factory.aviation;

public class CivilHelicopterFactory extends HelicopterFactory {

    @Override
    public Helicopter create(String name) {
        return new CivilHelicopter(name, 12);
    }
}
