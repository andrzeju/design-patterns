package pl.urbanlab.patterns.creational.factory.aviation.factory;

import pl.urbanlab.patterns.creational.factory.aviation.model.Helicopter;

public abstract class HelicopterFactory {

    public abstract Helicopter create(String name);
}
