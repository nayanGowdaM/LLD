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
        ticketRepository.save(ticket);
        System.out.println("Ticket generated for vehicle: " + vehicle.getNumber() + " with ticketId: " + ticket.getId());
        return ticket;
    }

    // Service layer handles business logic - throws exception if not found
    public Ticket getTicket(UUID ticketId){
        Ticket ticket = ticketRepository.findById(ticketId);
        if (ticket == null) {
            throw new RuntimeException("Ticket not found with ID: " + ticketId);
        }
        return ticket;
    }

    public Ticket validateTicket(UUID ticketId){
        Ticket ticket = getTicket(ticketId);
        if(!ticket.isActive()){
            throw new RuntimeException("Ticket with ID: " + ticketId + " is not active");
        }
        return ticket;
    }

    public void deactivateTicket(UUID ticketId){
        Ticket ticket = ticketRepository.findById(ticketId);
        ticket.setActive(false);
    }
}
