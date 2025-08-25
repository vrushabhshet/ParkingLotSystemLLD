package ParkingLot;

import ParkingLot.ParkingSpot.ParkingSpot;
import ParkingLot.ParkingSpotManager.ParkingManagerFactory;
import ParkingLot.ParkingSpotManager.ParkingSpotManager;
import ParkingLot.ParkingStrategy.ParkingStrategy;

public class EntranceGate {
    private ParkingManagerFactory parkingManagerFactory;
    private ParkingSpotManager parkingSpotManager;
    private Ticket ticket;
    private ParkingStrategy parkingStrategy;

    public EntranceGate() {
        parkingManagerFactory = new ParkingManagerFactory();
    }

    public void setParkingStrategy(ParkingStrategy strategy) {
        this.parkingStrategy = strategy;
    }

    public ParkingSpot findParkingSpot(VehicleType vehicleType) {
        parkingSpotManager = parkingManagerFactory.getParkingSpotManager(vehicleType);
        if (parkingStrategy != null) {
            parkingSpotManager.setParkingStrategy(parkingStrategy);
        }
        return parkingSpotManager.findParkingSpot(vehicleType);
    }

    public boolean parkVehicleOnSpot(Vehicle vehicle, ParkingSpot parkingSpot) {
        parkingSpotManager = parkingManagerFactory.getParkingSpotManager(vehicle.getVehicleType());
        if (parkingStrategy != null) {
            parkingSpotManager.setParkingStrategy(parkingStrategy);
        }
        return parkingSpotManager.parkVehicle(parkingSpot, vehicle);
    }

    public Ticket generateTicket(String ticketId, Vehicle vehicle, ParkingSpot parkingSpot) {
        ticket = new Ticket(ticketId, vehicle, parkingSpot);
        return ticket;
    }
}