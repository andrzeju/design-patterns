package pl.urbanlab.patterns.structural.adapter;

/**
 * Created by andrzej on 17.06.17.
 */
public class RaceCarAdapter implements RaceCar {

    private final DaewooMatiz matiz;

    public RaceCarAdapter(DaewooMatiz matiz) {
        this.matiz = matiz;
    }

    @Override
    public void race() {
        matiz.drive();
    }

    @Override
    public void drift() {
        matiz.turn();
    }
}
