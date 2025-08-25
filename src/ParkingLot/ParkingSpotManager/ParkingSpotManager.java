package ParkingLot.ParkingSpotManager;

import java.util.ArrayList;
import java.util.List;

import ParkingLot.VehicleType;
import ParkingLot.ParkingSpot.ParkingSpot;
import ParkingLot.ParkingStrategy.ParkingStrategy;

public class ParkingSpotManager{
    protected List<ParkingSpot> parkingSpots;
    protected ParkingStrategy parkingStrategy;
    
    public ParkingSpotManager(List<ParkingSpot> parkingSpots, ParkingStrategy parkingStrategy) {
        this.parkingSpots = parkingSpots;
        this.parkingStrategy = parkingStrategy;
    }

    public ParkingSpotManager(List<ParkingSpot> parkingSpots) {
        this(parkingSpots, null);
    }

    public ParkingSpotManager() {
        this.parkingSpots = new ArrayList<>();
        this.parkingStrategy = null;
    }
    
    public void setParkingStrategy(ParkingStrategy strategy) {
        this.parkingStrategy = strategy;
    }
    
    public ParkingSpot findParkingSpot(VehicleType vehicleType) {
        if (parkingStrategy != null) {
            return parkingStrategy.findParkingSpot();
        }
        // fallback to default logic
        for (ParkingSpot spot : parkingSpots) {
            if (spot.isEmpty() && spot.getVehicleType() == vehicleType) {
                return spot;
            }
        }
        return null;
    }

    public boolean parkVehicle(ParkingSpot spot, ParkingLot.Vehicle vehicle) {
        if (spot != null && spot.isEmpty()) {
            spot.parkVehicle(vehicle);
            return true;
        }
        return false;
    }

    public boolean removeVehicle(ParkingSpot spot) {
        if (spot != null && !spot.isEmpty()) {
            spot.removeVehicle(spot.getVehicle());
            return true;
        }
        return false;
    }
    
    public void addParkingSpot(ParkingSpot parkingSpot) {
        parkingSpots.add(parkingSpot);
    }

    public void removeParkingSpot(ParkingSpot parkingSpot) {
        parkingSpots.remove(parkingSpot);
    }
}