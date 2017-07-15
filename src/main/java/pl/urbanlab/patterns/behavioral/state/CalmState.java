package pl.urbanlab.patterns.behavioral.state;

/**
 * Created by andrzej on 15.07.17.
 */
public class CalmState implements MentalState {
    @Override
    public void saySomething() {
        System.out.println("I'm easy like a sunday morning....");
    }
}
