package pl.urbanlab.patterns.structural.adapter;

/**
 * Created by andrzej on 17.06.17.
 */
public class NissanSkyline implements RaceCar {

    @Override
    public void race() {
        System.out.println("vrrrrrooooooommmmm!!!");
    }

    @Override
    public void drift() {
        System.out.println("yyyyyyyyyyyyyyy");
    }
}
