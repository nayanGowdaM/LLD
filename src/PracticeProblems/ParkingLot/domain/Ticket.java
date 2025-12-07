package PracticeProblems.ParkingLot.domain;

import java.time.LocalDateTime;
import java.util.UUID;

public class Ticket {
    private final UUID id;
    private final UUID vehicleId;
    private final LocalDateTime entryTime;
    private final UUID slotId;
    private  boolean isActive;

    public Ticket(UUID vehicleId, UUID slotId) {
        this.id = UUID.randomUUID();
        this.vehicleId = vehicleId;
        this.slotId = slotId;
        this.entryTime = LocalDateTime.now();
        this.isActive = true;
    }

    public UUID getId() {
        return id;
    }

    public boolean isActive() {
        return isActive;
    }

    public UUID getVehicleId() {
        return vehicleId;
    }

    public UUID getSlotId() {
        return slotId;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
