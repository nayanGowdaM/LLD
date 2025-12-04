package PracticeProblems.ParkingLot.domain;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Floor {
    private UUID id;
    private int floorNumber;
    private List<ParkingSlot> listOfSlots;

    public Floor(int floorNumber) {
        this.id = UUID.randomUUID();
        this.floorNumber = floorNumber;
        this.listOfSlots = new ArrayList<>();
    }

    public UUID getId(){
        return id;
    }

    public int getFloorNumber(){
        return floorNumber;
    }
}
