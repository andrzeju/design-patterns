package pl.urbanlab.patterns.creational.abstractFactory.aviation;

import pl.urbanlab.patterns.creational.abstractFactory.aviation.factory.CivilHelicopterFactory;
import pl.urbanlab.patterns.creational.abstractFactory.aviation.factory.HelicopterFactory;
import pl.urbanlab.patterns.creational.abstractFactory.aviation.factory.MilitaryHelicopterFactory;
import pl.urbanlab.patterns.creational.abstractFactory.aviation.model.Helicopter;

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
