package PracticeProblems.ParkingLot.repository;
import PracticeProblems.ParkingLot.domain.Receipt;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class ReceiptRepository {
    private Map<UUID, Receipt> receipts;

    public ReceiptRepository() {
        this.receipts = new ConcurrentHashMap<>();
    }

    public Receipt save(Receipt receipt){
        receipts.put(receipt.getId(), receipt);
        return receipt;
    }
}
