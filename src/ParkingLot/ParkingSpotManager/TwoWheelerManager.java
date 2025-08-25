package ParkingLot.ParkingSpotManager;

import java.util.ArrayList;
import java.util.List;

import ParkingLot.ParkingSpot.ParkingSpot;
import ParkingLot.ParkingSpot.TwoWheelerSpot;

public class TwoWheelerManager extends ParkingSpotManager {

	public static List<ParkingSpot> parkingSpots = new ArrayList<>();
	static {
		for (int i = 1; i <= 400; i++) {
			parkingSpots.add(new TwoWheelerSpot("TW-" + i));
		}
	}
	public TwoWheelerManager(){
		super(parkingSpots);
	}
}