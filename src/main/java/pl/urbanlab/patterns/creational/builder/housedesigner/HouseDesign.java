package pl.urbanlab.patterns.creational.builder.housedesigner;

public class HouseDesign {

    private final RoofType roofType;
    private final int bathrooms;
    private final int rooms;
    private final ParkingSpots parkingSpots;

    public HouseDesign(RoofType roofType, int bathrooms, int rooms, ParkingSpots parkingSpots) {

        this.roofType = roofType;
        this.bathrooms = bathrooms;
        this.rooms = rooms;
        this.parkingSpots = parkingSpots;
    }
}
