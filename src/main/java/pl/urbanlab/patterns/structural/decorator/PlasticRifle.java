package pl.urbanlab.patterns.structural.decorator;

/**
 * Created by Andrzej on 2017-06-22.
 */
public class PlasticRifle extends DecoratedRifle {

    public PlasticRifle(Rifle rifle) {
        this.rifle = rifle;
    }

    @Override
    public String getStats() {
        return rifle.getStats() + ", weight: 70%";
    }
}
