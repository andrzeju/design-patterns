package pl.urbanlab.patterns.creational.builder.housedesigner;

public class HouseDesignBuilder {

    private RoofType roofType = RoofType.FLAT;
    private int bathrooms = 1;
    private int rooms = 3;
    private ParkingSpots parkingSpots;

    public HouseDesign build() {
        return new HouseDesign(roofType, bathrooms, rooms, parkingSpots);
    }

    public HouseDesignBuilder withRoof(RoofType roofType) {
        this.roofType = roofType;
        return this;
    }

    public HouseDesignBuilder withRooms(int rooms) {
        this.rooms = rooms;
        return this;
    }

    public HouseDesignBuilder withBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
        return this;
    }

    public HouseDesignBuilder withGarage(ParkingSpots spots) {
        this.parkingSpots = spots;
        return this;
    }
}
