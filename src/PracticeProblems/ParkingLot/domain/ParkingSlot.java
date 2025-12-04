package PracticeProblems.ParkingLot.domain;

import java.util.UUID;

public class ParkingSlot {
    UUID id;
    int floor;
    boolean isOccupied;
    VehicleType vehicleType;

    public ParkingSlot(int floor, VehicleType vehicleType) {
        this.id = UUID.randomUUID();
        this.floor = floor;
        this.vehicleType = vehicleType;
        this.isOccupied = false;
    }

    public UUID getId() {
        return id;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public boolean isOccupied(){
        return isOccupied;
    }
}
