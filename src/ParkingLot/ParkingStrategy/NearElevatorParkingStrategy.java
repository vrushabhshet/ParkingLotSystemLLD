package ParkingLot.ParkingStrategy;

import ParkingLot.ParkingSpot.ParkingSpot;

import java.util.List;

public class NearElevatorParkingStrategy implements ParkingStrategy  {
    private List<ParkingSpot> parkingSpots;

    public NearElevatorParkingStrategy(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    @Override
    public ParkingSpot findParkingSpot() {
        // Example: pick the first available spot (simulate 'near elevator')
        for (ParkingSpot spot : parkingSpots) {
            if (spot.isEmpty()) {
                return spot;
            }
        }
        return null;
    }
}