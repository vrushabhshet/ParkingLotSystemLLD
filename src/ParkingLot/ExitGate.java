package ParkingLot;

public class ExitGate {
//cost calculation,payment, update parking spot.
    public double calculateCost(long hoursParked, int pricePerHour) {
        return hoursParked * pricePerHour;
    }

    public boolean processPayment(double amountPaid, double cost) {
        return amountPaid >= cost;
    }

    public void updateParkingSpot(ParkingLot.ParkingSpot.ParkingSpot spot) {
        if (spot != null && !spot.isEmpty()) {
            spot.removeVehicle(spot.getVehicle());
        }
    }
}