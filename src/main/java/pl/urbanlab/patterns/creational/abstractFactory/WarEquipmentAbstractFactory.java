package pl.urbanlab.patterns.creational.abstractFactory;

public class WarEquipmentAbstractFactory {

    WarEquipmentAbstractFactory create(EquipmentType type) {
        if (type.equals(EquipmentType.AIRCRAFT)) {
            return new AircraftFactory();
        } else {
            return new VehicleFactory();
        }
    }
}
