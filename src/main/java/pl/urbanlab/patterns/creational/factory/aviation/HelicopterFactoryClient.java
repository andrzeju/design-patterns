package pl.urbanlab.patterns.creational.factory.aviation;

public class HelicopterFactoryClient {

    public static void main(String[] args) {

        HelicopterFactory civilProductionLine = new CivilHelicopterFactory();
        HelicopterFactory militaryProductionLine = new MilitaryHelicopterFactory();

        Helicopter civilHelicopter = civilProductionLine.create("Augusta Westland AW169");
        Helicopter militaryHelicopter = militaryProductionLine.create("Sikorsky Black Hawk");

        System.out.println(civilHelicopter.info());
        System.out.println(militaryHelicopter.info());
    }
}
