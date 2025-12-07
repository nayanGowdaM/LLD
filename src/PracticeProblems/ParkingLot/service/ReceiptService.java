package PracticeProblems.ParkingLot.service;

import PracticeProblems.ParkingLot.domain.Receipt;
import PracticeProblems.ParkingLot.repository.ReceiptRepository;
import java.util.UUID;

public class ReceiptService {
    ReceiptRepository receiptRepository;

    public ReceiptService(ReceiptRepository receiptRepository) {
        this.receiptRepository = receiptRepository;
    }

    public Receipt generateReceipt(UUID ticketId, double totalFee){
        Receipt receipt = new Receipt(ticketId, totalFee);
        receiptRepository.save(receipt);
        System.out.println("Receipt generated with id: " + receipt.getId());
        return receipt;
    }
}
