package pl.urbanlab.patterns.structural.decorator;

/**
 * Created by Andrzej on 2017-06-22.
 */
public class SilencedRifle extends DecoratedRifle {

    public SilencedRifle(Rifle rifle) {
        this.rifle = rifle;
    }

    @Override
    public String getStats() {
        return rifle.getStats() + ", noise: 20%";
    }
}
