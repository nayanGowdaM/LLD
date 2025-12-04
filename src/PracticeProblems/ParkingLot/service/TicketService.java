package PracticeProblems.ParkingLot.service;
import PracticeProblems.ParkingLot.domain.Ticket;
import PracticeProblems.ParkingLot.repository.TicketRepository;
import PracticeProblems.ParkingLot.domain.Vehicle;

import java.util.UUID;

public class TicketService {
    private TicketRepository ticketRepository;
    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public Ticket generateTicket(Vehicle vehicle, UUID slotId){
        Ticket ticket = new Ticket(vehicle.getId(), slotId);
        System.out.println("Ticket generated for vehicle: " + vehicle.getNumber());
        return ticket;
    }
}
