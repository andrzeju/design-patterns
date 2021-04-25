package pl.urbanlab.patterns.creational.builder.housedesigner;

public class HouseDesignerClient {

    public static void main(String[] args) {
        HouseDesignBuilder builder = new HouseDesignBuilder();
        HouseDesign project = builder
            .withRoof(RoofType.FLAT)
            .withRooms(5)
            .withBathrooms(2)
            .withGarage(ParkingSpots.DOUBLE)
            .build();
    }
}
