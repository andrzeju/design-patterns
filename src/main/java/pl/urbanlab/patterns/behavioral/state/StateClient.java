package pl.urbanlab.patterns.behavioral.state;

/**
 * Created by andrzej on 15.07.17.
 */
public class StateClient {
    public static void main(String[] args) {
        Person human = new Person();
        human.saySomething();
        human.getAngry();
        human.saySomething();
        human.calmDown();
        human.saySomething();
    }
}

class Person {

    private MentalState state = new CalmState();

    public void getAngry() {
        this.state = new AngryState();
    }

    public void calmDown() {
        this.state = new CalmState();
    }

    public void saySomething() {
        state.saySomething();
    }
}
