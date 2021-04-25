package pl.urbanlab.patterns.creational.factory.aviation;

public class Helicopter {

    private final String name;
    private final int seats;
    private final int guns;

    public Helicopter(String name, int seats, int guns) {
        this.name = name;
        this.seats = seats;
        this.guns = guns;
    }

    public String info() {
        return "I'm " + name + ". I have " + seats + " seats and " + guns + " guns";
    }

    public static Helicopter createCivil(String name) {
        return new Helicopter(name, 12, 0);
    }

    public static Helicopter createMilitary(String name) {
        return new Helicopter(name, 4, 2);
    }
}
