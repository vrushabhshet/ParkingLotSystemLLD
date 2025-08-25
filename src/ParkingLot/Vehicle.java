package ParkingLot;

public class Vehicle {
	private String VehicleNuber;
	private VehicleType vehicleType;

	public Vehicle(String vehicleNuber, VehicleType vehicalType) {
		super();
		VehicleNuber = vehicleNuber;
		this.vehicleType = vehicalType;
	}

	public String getVehicleNumber() {
		return VehicleNuber;
	}

	public void setVehicleNumber(String vehicleNuber) {
		VehicleNuber = vehicleNuber;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicalType) {
		this.vehicleType = vehicalType;
	}

}
