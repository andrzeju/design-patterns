package pl.urbanlab.patterns.creational.abstractFactory.aviation.model;

public class MilitaryHelicopter extends Helicopter {

    private int guns;

    public MilitaryHelicopter(String name, int seats, int guns) {
        this.name = name;
        this.seats = seats;
        this.guns = guns;
    }

    @Override
    public String info() {
        return super.info() + " I also have " + guns + " guns";
    }
}
