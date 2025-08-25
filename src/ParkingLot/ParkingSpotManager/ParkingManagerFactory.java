package ParkingLot.ParkingSpotManager;

import ParkingLot.VehicleType;

public class ParkingManagerFactory {
	
	public ParkingSpotManager getParkingSpotManager(VehicleType vehicleType) {
		switch (vehicleType.toString()) {
			case "TWO_WHEELER":
				return new TwoWheelerManager();
			case "FOUR_WHEELER":
				return new FourWheelerManager();
			default:
				throw new IllegalArgumentException("Unknown parking strategy type: " + vehicleType);
		}
	}
}
