package ParkingLot.ParkingSpotManager;

import java.util.ArrayList;
import java.util.List;

import ParkingLot.ParkingSpot.FourWheelerSpot;
import ParkingLot.ParkingSpot.ParkingSpot;

public class FourWheelerManager extends ParkingSpotManager {
    public static List<ParkingSpot> parkingSpots = new ArrayList<>();
    static {
        for (int i = 1; i <= 600; i++) {
            parkingSpots.add(new FourWheelerSpot("FW-" + i));
        }
    }
    public FourWheelerManager() {
        super(parkingSpots);
    }
}