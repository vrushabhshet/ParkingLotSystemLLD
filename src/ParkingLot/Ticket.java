package ParkingLot;

import java.time.LocalDateTime;

import ParkingLot.ParkingSpot.ParkingSpot;

public class Ticket {
	private String id;
	private Vehicle vehicle;
	private ParkingSpot parkingspot;
	private LocalDateTime entryTime;

	public Ticket(String id, Vehicle vehicle, ParkingSpot parkingspot) {
		super();
		this.id = id;
		this.vehicle = vehicle;
		this.parkingspot = parkingspot;
		this.entryTime = LocalDateTime.now();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public ParkingSpot getParkingspot() {
		return parkingspot;
	}

	public void setParkingspot(ParkingSpot parkingspot) {
		this.parkingspot = parkingspot;
	}

	public LocalDateTime getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(LocalDateTime entryTime) {
		this.entryTime = entryTime;
	}

}
