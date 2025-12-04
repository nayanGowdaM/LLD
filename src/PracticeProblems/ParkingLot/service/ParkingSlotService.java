package PracticeProblems.ParkingLot.service;

import PracticeProblems.ParkingLot.domain.ParkingSlot;
import PracticeProblems.ParkingLot.domain.VehicleType;
import PracticeProblems.ParkingLot.repository.ParkingSlotRepository;
import java.util.List;

import java.util.Optional;

public class ParkingSlotService {
    private ParkingSlotRepository parkingSlotRepository;

    public ParkingSlotService(ParkingSlotRepository parkingSlotRepository) {
        this.parkingSlotRepository = parkingSlotRepository;
    }

    public int getAvailableSlotCount(VehicleType type){
        return parkingSlotRepository.getNumberOfAvailableSlots();
    }

    public ParkingSlot allocateSlot(VehicleType type){
        Optional<ParkingSlot> slot = parkingSlotRepository.allocateSlot(type);
        return slot.orElseThrow(()-> new RuntimeException("Slot Not available")) ;
    }
}
