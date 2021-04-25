package pl.urbanlab.patterns.creational.factory.aviation;

public class HelicopterFactoryClient {

    public static void main(String[] args) {

        Helicopter civilHelicopter = Helicopter.createCivil("Augusta Westland AW169");
        Helicopter militaryHelicopter = Helicopter.createMilitary("Sikorsky Black Hawk");

        System.out.println(civilHelicopter.info());
        System.out.println(militaryHelicopter.info());
    }
}
