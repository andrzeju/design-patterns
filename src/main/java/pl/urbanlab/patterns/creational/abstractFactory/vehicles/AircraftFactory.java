package pl.urbanlab.patterns.creational.abstractFactory.vehicles;

public class AircraftFactory extends WarEquipmentAbstractFactory {

    Equipment create(String aircraftClass) {
        if (aircraftClass.equals("fighter")) {
            return new Equipment("F-16", 40);
        } else {
            return new Equipment("B-2", 80);
        }
    }
}
