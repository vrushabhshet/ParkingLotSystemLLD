package ParkingLot.ParkingSpot;

import ParkingLot.VehicleType;

public class TwoWheelerSpot extends ParkingSpot{

	public TwoWheelerSpot(String id) {
        super(id, 10, VehicleType.TWO_WHEELER);
	}

}
