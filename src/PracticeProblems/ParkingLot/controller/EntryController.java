package PracticeProblems.ParkingLot.controller;

import PracticeProblems.ParkingLot.domain.ParkingSlot;
import PracticeProblems.ParkingLot.domain.Ticket;
import PracticeProblems.ParkingLot.domain.Vehicle;
import PracticeProblems.ParkingLot.domain.VehicleType;
import PracticeProblems.ParkingLot.service.ParkingSlotService;
import PracticeProblems.ParkingLot.service.TicketService;

import java.util.UUID;

public class EntryController {
    ParkingSlotService parkingSlotService;
    TicketService ticketService;

    public EntryController(ParkingSlotService parkingSlotService, TicketService ticketService) {
        this.parkingSlotService = parkingSlotService;
        this.ticketService = ticketService;
    }

    public EntryResult entry(String number, VehicleType type){
        Vehicle vehicle = new Vehicle(number, type);

//        allocate slot
        try{
            ParkingSlot slot = parkingSlotService.allocateSlot(type);
            Ticket ticket = ticketService.generateTicket(vehicle, slot.getId());
            System.out.println("Vehicle entered the parking lot");
            return new EntryResult(true, ticket.getId(), slot.getId(), "Vehicle Entered Parking Lot");
        }catch(Exception e){
            System.out.println("Vehicle Entry Failed: "+ e.getMessage());
            return new EntryResult(false, null, null, e.getMessage());
        }
//        generate ticket


    }

    public static class EntryResult{
        private final boolean success;
        private final UUID ticketId;
        private final UUID slotId;
        private final String message;

        public EntryResult(boolean success, UUID ticketId, UUID slotId, String message) {
            this.success = success;
            this.ticketId = ticketId;
            this.slotId = slotId;
            this.message = message;
        }

        public UUID getTicketId() {
            return ticketId;
        }
    }
}
