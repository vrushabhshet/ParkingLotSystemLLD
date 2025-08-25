package ParkingLot.ParkingStrategy;

import ParkingLot.ParkingSpot.ParkingSpot;

import java.util.List;

public class NearEntryGateParkingStrategy implements ParkingStrategy  {
    private List<ParkingSpot> parkingSpots;

    public NearEntryGateParkingStrategy(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    @Override
    public ParkingSpot findParkingSpot() {
        // Example: pick the first available spot (simulate 'near entry gate')
        for (ParkingSpot spot : parkingSpots) {
            if (spot.isEmpty()) {
                return spot;
            }
        }
        return null;
    }
}