package Stalls;

public abstract class Stall {

    private String name;
    private String ownerName;
    private int parkingSpot;
    protected double price;

    public Stall (String name, String ownerName, int parkingSpot) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.price = 0;

    }

    public String getName() {
        return this.name;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public int getParkingSpot() {
        return this.parkingSpot;
    }

    public double getPrice() {
        return this.price;
    }
}
