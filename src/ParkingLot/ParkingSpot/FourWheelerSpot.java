package ParkingLot.ParkingSpot;

import ParkingLot.VehicleType;

public class FourWheelerSpot extends ParkingSpot {
	public FourWheelerSpot(String id) {
		super(id, 20, VehicleType.FOUR_WHEELER);
	}
}
