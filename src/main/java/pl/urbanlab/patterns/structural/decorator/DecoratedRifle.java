package pl.urbanlab.patterns.structural.decorator;

/**
 * Created by Andrzej on 2017-06-22.
 */
public abstract class DecoratedRifle extends Rifle {

    protected Rifle rifle;

    public abstract String getStats();
}
