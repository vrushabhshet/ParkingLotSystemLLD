package ParkingLot;

import ParkingLot.ParkingSpot.ParkingSpot;
import ParkingLot.ParkingStrategy.NearElevatorParkingStrategy;
import ParkingLot.ParkingSpotManager.FourWheelerManager;
import ParkingLot.ParkingSpotManager.TwoWheelerManager;
import ParkingLot.VehicleType;

public class ParkingLotApp {
    public static void main(String[] args) {
        // Example: Two-wheeler entry
        Vehicle vehicle1 = new Vehicle("TW123", VehicleType.TWO_WHEELER);
        EntranceGate entranceGate = new EntranceGate();
        // Set strategy for two-wheeler
        NearElevatorParkingStrategy twoWheelerStrategy = new NearElevatorParkingStrategy(TwoWheelerManager.parkingSpots);
        entranceGate.setParkingStrategy(twoWheelerStrategy);
        ParkingSpot spot1 = entranceGate.findParkingSpot(vehicle1.getVehicleType());
        if (spot1 != null && entranceGate.parkVehicleOnSpot(vehicle1, spot1)) {
            Ticket ticket1 = entranceGate.generateTicket("TICKET1", vehicle1, spot1);
            System.out.println("Vehicle parked. Ticket ID: " + ticket1.getId());
        } else {
            System.out.println("No available spot for vehicle.");
        }

        // Example: Four-wheeler entry
        Vehicle vehicle2 = new Vehicle("FW456", VehicleType.FOUR_WHEELER);
        // Set strategy for four-wheeler
        NearElevatorParkingStrategy fourWheelerStrategy = new NearElevatorParkingStrategy(FourWheelerManager.parkingSpots);
        entranceGate.setParkingStrategy(fourWheelerStrategy);
        ParkingSpot spot2 = entranceGate.findParkingSpot(vehicle2.getVehicleType());
        if (spot2 != null && entranceGate.parkVehicleOnSpot(vehicle2, spot2)) {
            Ticket ticket2 = entranceGate.generateTicket("TICKET2", vehicle2, spot2);
            System.out.println("Vehicle parked. Ticket ID: " + ticket2.getId());
        } else {
            System.out.println("No available spot for vehicle.");
        }

        // Example: Exit process for vehicle1
        ExitGate exitGate = new ExitGate();
        long hoursParked = 3; // Example duration
        double cost = exitGate.calculateCost(hoursParked, spot1.getPrice());
        double amountPaid = cost; // Assume exact payment
        if (exitGate.processPayment(amountPaid, cost)) {
            exitGate.updateParkingSpot(spot1);
            System.out.println("Payment successful. Spot is now free.");
        } else {
            System.out.println("Payment failed. Please pay the full amount.");
        }
    }
}