package ParkingLot.ParkingSpot;

import ParkingLot.Vehicle;
import ParkingLot.VehicleType;

public abstract class ParkingSpot {
	private String id;
	private boolean isEmpty;
	private Vehicle vehicle;
	private int price;
	private VehicleType vehicleType;

	public ParkingSpot(String id, int price, VehicleType vehicleType) {
		super();
		this.id = id;
		this.isEmpty = true;
		this.price = price;
		this.vehicleType = vehicleType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void removeVehicle(Vehicle vehicle) {
		if (isEmpty) {
			System.out.println("Spot " + id + " is already empty!");
			return;
		}
		System.out.println("Vehicle " + vehicle.getVehicleNumber() + " removed from " + id);
		this.vehicle = null;
		this.isEmpty = true;
	}

	public void parkVehicle(Vehicle vehicle) {
		if (!this.isEmpty) {
			System.out.println("parking spot " + id + "already occupied");
			return;
		}

		if (vehicle.getVehicleType() != this.vehicleType) {
			System.out.println("parking spot " + id + "is not for this" + vehicle.getVehicleType() + "type");
			return;
		}
		this.vehicle = vehicle;
		this.isEmpty = false;
		System.out.println("Vehicle " + vehicle.getVehicleNumber() + " parked in " + id);

	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

}