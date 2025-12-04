package PracticeProblems.ParkingLot.repository;

import PracticeProblems.ParkingLot.domain.ParkingSlot;
import PracticeProblems.ParkingLot.domain.VehicleType;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ParkingSlotRepository {
    private Map<UUID, ParkingSlot> slots = new ConcurrentHashMap<>();
    private  int availableSlots;

    public ParkingSlotRepository() {
        this.slots = new ConcurrentHashMap<>();
        this.availableSlots = 0;
    }

    public Optional<ParkingSlot> findById(UUID slotId){
        return Optional.ofNullable(slots.get(slotId));
    }
    public ParkingSlot save(ParkingSlot slot){
        slots.put(slot.getId(), slot);
        availableSlots++;
        return slot;
    }
    public List<ParkingSlot> findAll(){
        List<ParkingSlot> slotList = new ArrayList<>(slots.values());
        return slotList;
    }
    public List<ParkingSlot> getAvailableSlots(VehicleType type){
        List<ParkingSlot> slotList = new ArrayList<>(slots.values());
        List<ParkingSlot> availableSlots = new ArrayList<>();
        for(ParkingSlot slot: slotList){
            if(!slot.isOccupied() && (slot.getVehicleType()==type)){
                availableSlots.add(slot);
            }
        }
        return availableSlots;
    }

    public Optional<ParkingSlot> allocateSlot(VehicleType type){
        return getAvailableSlots(type).stream().findFirst();
    }

    public int getNumberOfAvailableSlots() {
        return availableSlots;
    }
}
