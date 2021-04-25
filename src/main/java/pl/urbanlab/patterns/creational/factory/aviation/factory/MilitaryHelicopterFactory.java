package pl.urbanlab.patterns.creational.factory.aviation.factory;

import pl.urbanlab.patterns.creational.factory.aviation.model.Helicopter;
import pl.urbanlab.patterns.creational.factory.aviation.model.MilitaryHelicopter;

public class MilitaryHelicopterFactory extends HelicopterFactory {

    @Override
    public Helicopter create(String name) {
        return new MilitaryHelicopter(name, 4, 2);
    }
}
