# Parking Lot System

This project implements a Parking Lot Management System in Java, designed with object-oriented principles for scalability and maintainability. The system models real-world parking operations, including vehicle entry/exit, ticketing, spot management, and payment processing.

## Low Level Design

### Main Components

- **ParkingLot**: Central class managing all parking operations, including spot allocation, ticketing, and payment.
- **ParkingSpot**: Represents individual parking spots, tracks availability and type (e.g., regular, handicapped, electric).
- **ParkingSpotManager**: Handles allocation and release of parking spots, maintains spot inventory.
- **Vehicle**: Represents vehicles entering the lot, with attributes like license plate and type (car, bike, truck).
- **Ticket**: Issued when a vehicle enters, tracks entry time, assigned spot, and is used for payment calculation.
- **EntranceGate/ExitGate**: Manages vehicle entry and exit, interacts with ParkingLot and Ticketing.
- **ParkingStrategy**: Interface/abstract class for spot allocation strategies (e.g., nearest available, random, reserved).

### Class Responsibilities

- **ParkingLot**:
  - Initializes parking spots and managers.
  - Handles vehicle entry/exit, ticketing, and payment.
  - Coordinates with ParkingSpotManager and gates.
- **ParkingSpotManager**:
  - Allocates and releases spots based on strategy.
  - Maintains spot status and inventory.
- **EntranceGate/ExitGate**:
  - Handles user interaction for entry/exit.
  - Issues and closes tickets.
- **Ticket**:
  - Stores entry/exit times, spot info, and calculates fees.
- **ParkingStrategy**:
  - Allows for different spot allocation algorithms.

### System Flow
1. **Vehicle Entry**: Vehicle arrives at EntranceGate, receives a ticket, and is assigned a spot.
2. **Parking**: Vehicle parks in the assigned spot; spot status is updated.
3. **Vehicle Exit**: Vehicle presents ticket at ExitGate, fee is calculated, and spot is released.
4. **Spot Management**: ParkingSpotManager updates spot availability and handles allocation for new arrivals.

### Extensibility
- Add new spot types (e.g., VIP, electric) by extending ParkingSpot.
- Implement new allocation strategies by extending ParkingStrategy.
- Integrate payment gateways or reservation systems.

## Example Usage
Run the main application to simulate vehicle entry, parking, and exit. The system will allocate spots, issue tickets, and calculate fees.

## Design Principles
- **Separation of Concerns**: Each class has a focused responsibility.
- **Encapsulation**: Internal details of spot management and ticketing are hidden from other components.
- **Extensibility**: New features and strategies can be added with minimal changes.

---
Explore and extend the Parking Lot System for more advanced parking scenarios!
