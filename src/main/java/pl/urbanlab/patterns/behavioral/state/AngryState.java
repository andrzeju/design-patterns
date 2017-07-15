package pl.urbanlab.patterns.behavioral.state;

/**
 * Created by andrzej on 15.07.17.
 */
public class AngryState implements MentalState {
    @Override
    public void saySomething() {
        System.out.println("Aaaaaaaaaaaaaaaargh!!!!!");
    }
}
