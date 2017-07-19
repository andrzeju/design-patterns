package pl.urbanlab.patterns.creational.abstractFactory;

public class VehicleFactory extends WarEquipmentAbstractFactory {
    Equipment create(String vehicleClass) {
        if (vehicleClass.equals("tank")) {
            return new Equipment("abramhs", 45);
        } else {
            return new Equipment("pershing p1", 70);
        }
    }
}
