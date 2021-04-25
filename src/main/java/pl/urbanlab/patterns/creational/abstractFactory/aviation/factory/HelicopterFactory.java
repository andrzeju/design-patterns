package pl.urbanlab.patterns.creational.abstractFactory.aviation.factory;

import pl.urbanlab.patterns.creational.abstractFactory.aviation.model.Helicopter;

public abstract class HelicopterFactory {

    public abstract Helicopter create(String name);
}
