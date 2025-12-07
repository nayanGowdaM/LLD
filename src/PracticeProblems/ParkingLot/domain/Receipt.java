package PracticeProblems.ParkingLot.domain;
import java.time.LocalDateTime;
import java.util.UUID;

public class Receipt {
    private final UUID id;
    private final UUID ticketId;
    private double totalFee;
    private final LocalDateTime exitTime;

    public Receipt(UUID ticketId, double totalFee) {
        this.id = UUID.randomUUID();
        this.ticketId = ticketId;
        this.totalFee = totalFee;
        this.exitTime = LocalDateTime.now();
    }

    public UUID getId() {
        return id;
    }
}
