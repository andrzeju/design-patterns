package pl.urbanlab.patterns.creational.factory.aviation.model;

public class Helicopter {

    protected String name;
    protected int seats;

    public String info() {
        return "I'm " + name + ". I have " + seats + " seats.";
    }

}
