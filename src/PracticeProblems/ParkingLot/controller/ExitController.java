package PracticeProblems.ParkingLot.controller;

import PracticeProblems.ParkingLot.domain.Receipt;
import PracticeProblems.ParkingLot.domain.Ticket;
import PracticeProblems.ParkingLot.service.ParkingSlotService;
import PracticeProblems.ParkingLot.service.ReceiptService;
import PracticeProblems.ParkingLot.service.TicketService;

import java.util.UUID;

public class ExitController {
    private TicketService ticketService;
    private ReceiptService receiptService;
    private ParkingSlotService parkingSlotService;
    public static class ExitResult{
        public final boolean success;
        public final double totalFee;
        public final UUID receiptId;
        private final String message;

        public ExitResult(boolean success, double totalFee, UUID receiptId, String message) {
            this.success = success;
            this.totalFee = totalFee;
            this.receiptId = receiptId;
            this.message = message;
        }
    };

    public ExitController(TicketService ticketService, ReceiptService receiptService, ParkingSlotService parkingSlotService) {
        this.ticketService = ticketService;
        this.receiptService = receiptService;
        this.parkingSlotService = parkingSlotService;
    }

    public ExitResult exit(UUID ticketId){
        try{
            Ticket ticket = ticketService.validateTicket(ticketId);
            // payment
            // Generate Receipt

            Receipt receipt = receiptService.generateReceipt(ticketId, 100);
            parkingSlotService.releaseSlot(ticket.getSlotId());
            ticketService.deactivateTicket(ticketId);
            System.out.println("Vehicle exited the parking lot with receipt Id: " + receipt.getId());
            return new ExitResult(true, 100, UUID.randomUUID(), "Vehicle Exited");
        }catch (Exception e){
            System.out.println("Vehicle Exit Failed: "+ e.getMessage());
            return new ExitResult(false, 100, null, e.getMessage());
        }
    }
}
