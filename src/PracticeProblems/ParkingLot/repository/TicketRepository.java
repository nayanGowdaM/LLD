package PracticeProblems.ParkingLot.repository;

import PracticeProblems.ParkingLot.domain.Ticket;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class TicketRepository {
    private Map<UUID, Ticket>  tickets = new ConcurrentHashMap<>();
    private Map<UUID, UUID> vehicleIdtoTicketId = new ConcurrentHashMap<>();
    private  Map<UUID, UUID> slotIdToTicketId = new ConcurrentHashMap<>();

    public Ticket save(Ticket ticket){
        tickets.put( ticket.getId(), ticket);
        return ticket;
    }

    // Repository returns null if not found - Service layer handles business logic
    public Ticket findById(UUID ticketId){
        return tickets.get(ticketId);
    }

    public Optional<Ticket> findByVehicleId(UUID vehicleId){
        UUID ticketId = vehicleIdtoTicketId.get(vehicleId);
        return  Optional.ofNullable(tickets.get(ticketId));
    }

    public Optional<Ticket> findBySlotId(UUID slotId){
        UUID ticketId = slotIdToTicketId.get(slotId);
        return Optional.ofNullable( tickets.get(ticketId));
    }


}
