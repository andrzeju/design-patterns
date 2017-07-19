package pl.urbanlab.patterns.creational.abstractFactory;

public class AbstractFactoryClient {

    public static void main(String[] args) {
        WarEquipmentAbstractFactory abstractFactory = new WarEquipmentAbstractFactory();

        AircraftFactory aircraftFactory = (AircraftFactory) abstractFactory.create(EquipmentType.AIRCRAFT);
        VehicleFactory vehicleFactory = (VehicleFactory) abstractFactory.create(EquipmentType.LAND_VEHICLE);

        Equipment f16 = aircraftFactory.create("fighter");
        Equipment b2 = aircraftFactory.create("bomber");

        Equipment abrahms = vehicleFactory.create("tank");
        Equipment pershing = vehicleFactory.create("launcher");

        System.out.println(f16.getName() + ", hit points:" + f16.getHitPoints());
        System.out.println(b2.getName() + ", hit points:" + b2.getHitPoints());
        System.out.println(abrahms.getName() + ", hit points:" + abrahms.getHitPoints());
        System.out.println(pershing.getName() + ", hit points:" + pershing.getHitPoints());

    }

}
