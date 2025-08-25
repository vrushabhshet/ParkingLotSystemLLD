package ParkingLot.ParkingStrategy;

import ParkingLot.ParkingSpot.ParkingSpot;

import java.util.List;

public class NearExitGateParkingStrategy implements ParkingStrategy {
    private List<ParkingSpot> parkingSpots;

    public NearExitGateParkingStrategy(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    @Override
    public ParkingSpot findParkingSpot() {
        // Example: pick the last available spot (simulate 'near exit gate')
        for (int i = parkingSpots.size() - 1; i >= 0; i--) {
            ParkingSpot spot = parkingSpots.get(i);
            if (spot.isEmpty()) {
                return spot;
            }
        }
        return null;
    }
}