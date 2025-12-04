package PracticeProblems.ParkingLot.domain;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

public class Ticket {
    private UUID id;
    private UUID vehicleId;
    private LocalDateTime entryTime;
    private UUID slotId;
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
}
