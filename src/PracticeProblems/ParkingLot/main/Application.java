package PracticeProblems.ParkingLot.main;

import PracticeProblems.ParkingLot.controller.EntryController;
import PracticeProblems.ParkingLot.controller.ExitController;
import PracticeProblems.ParkingLot.domain.Floor;
import PracticeProblems.ParkingLot.domain.ParkingSlot;
import PracticeProblems.ParkingLot.domain.VehicleType;
import PracticeProblems.ParkingLot.repository.FloorRepository;
import PracticeProblems.ParkingLot.repository.ParkingSlotRepository;
import PracticeProblems.ParkingLot.repository.ReceiptRepository;
import PracticeProblems.ParkingLot.repository.TicketRepository;
import PracticeProblems.ParkingLot.service.ParkingSlotService;
import PracticeProblems.ParkingLot.service.ReceiptService;
import PracticeProblems.ParkingLot.service.TicketService;

public class Application {
    FloorRepository floorRepository;
    ParkingSlotRepository parkingSlotRepository;

    public Application(FloorRepository floorRepository, ParkingSlotRepository parkingSlotRepository) {
        this.floorRepository = floorRepository;
        this.parkingSlotRepository = parkingSlotRepository;
    }

    private void addFloors(int floorNumber){
        if(floorRepository.exitsByNumber(floorNumber)) return;
        Floor floor = new Floor(floorNumber);
        floorRepository.save(floor);
        System.out.println("[Service] Added floor number " + floorNumber);
    }

    private void addSlot(int floorNumber, VehicleType type){
        ParkingSlot slot = new ParkingSlot(floorNumber, type);
        parkingSlotRepository.save(slot);
        System.out.println("[Service] Added slot with id: " + slot.getId() + "for vehicle of type: " + type);
    }
    public static void main(String[] args) {
        System.out.println("Parking Lot LLD");

//        First create Repositories
        TicketRepository ticketRepository = new TicketRepository();
        FloorRepository floorRepository = new FloorRepository();
        ParkingSlotRepository parkingSlotRepository = new ParkingSlotRepository();
        ReceiptRepository  receiptRepository = new ReceiptRepository();

//        Initalize Services
        TicketService ticketService = new TicketService(ticketRepository);
        ParkingSlotService parkingSlotService = new ParkingSlotService(parkingSlotRepository);
        ReceiptService receiptService = new ReceiptService(receiptRepository);

//        Initialize Controllers
        EntryController entryController = new EntryController(parkingSlotService, ticketService);
        ExitController exitController = new ExitController(ticketService, receiptService, parkingSlotService);

//        Initialize parking lot
        Application app = new Application(floorRepository, parkingSlotRepository);

//        Create 3 floors
        for(int i=0;i<3;i++){
            app.addFloors(i);
        }
        app.addSlot(0, VehicleType.CAR);
        app.addSlot(0, VehicleType.BIKE);
        app.addSlot(0,VehicleType.SUV);
        app.addSlot(0,VehicleType.EV);

        app.addSlot(1, VehicleType.CAR);
        app.addSlot(1, VehicleType.BIKE);
        app.addSlot(1,VehicleType.SUV);
        app.addSlot(1,VehicleType.EV);

        app.addSlot(2, VehicleType.CAR);
        app.addSlot(2, VehicleType.BIKE);
        app.addSlot(2,VehicleType.SUV);
        app.addSlot(2,VehicleType.EV);

//        Entry Flow
        EntryController.EntryResult entryResponse = entryController.entry("KA02JO4524", VehicleType.BIKE);

//        Exit Flow
        ExitController.ExitResult exitResult = exitController.exit(entryResponse.getTicketId());


    }
}
