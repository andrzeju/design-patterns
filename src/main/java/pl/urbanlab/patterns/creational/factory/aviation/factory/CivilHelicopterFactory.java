package pl.urbanlab.patterns.creational.factory.aviation.factory;

import pl.urbanlab.patterns.creational.factory.aviation.model.CivilHelicopter;
import pl.urbanlab.patterns.creational.factory.aviation.model.Helicopter;

public class CivilHelicopterFactory extends HelicopterFactory {

    @Override
    public Helicopter create(String name) {
        return new CivilHelicopter(name, 12);
    }
}
