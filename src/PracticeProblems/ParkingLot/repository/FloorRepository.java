package PracticeProblems.ParkingLot.repository;

import PracticeProblems.ParkingLot.domain.Floor;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class FloorRepository {
//     id to slots
    private Map<UUID, Floor> floors = new ConcurrentHashMap<>();
    private Map< Integer, UUID> floorNumberToId = new ConcurrentHashMap<>();

    public Floor save(Floor floor){
        floors.put( floor.getId(), floor);
        floorNumberToId.put( floor.getFloorNumber(), floor.getId());
        return floor;
    }

    public Optional<Floor> findById(UUID floorId){
        return Optional.ofNullable(floors.get(floorId));
    }

    public Optional<Floor> findByFloorNumber(int floorNumber){
        UUID floorId = floorNumberToId.get(floorNumber);
        return findById(floorId);
    }

    public boolean exitsByNumber(int floorNumber){
        return floorNumberToId.containsKey(floorNumber);
    }

}
