package PracticeProblems.ParkingLot.domain;


import java.util.UUID;

public class Vehicle {
    UUID id;
    String number;
    VehicleType type;

    public Vehicle(String number, VehicleType type) {
        this.id = UUID.randomUUID();
        this.number = number;
        this.type = type;
    }

    public UUID getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }
}
