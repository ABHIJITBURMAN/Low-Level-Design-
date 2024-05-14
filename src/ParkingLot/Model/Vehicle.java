package ParkingLot.Model;

import ParkingLot.Enums.VehicelType;

public class Vehicle {
    String licenceNumber;
    VehicelType vehicelType;
    ParkingTicket parkingTicket;

    public Vehicle(String licenceNumber, VehicelType vehicelType){
        this.licenceNumber = licenceNumber;
        this.vehicelType = vehicelType;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public VehicelType getVehicelType() {
        return vehicelType;
    }

    public void setVehicelType(VehicelType vehicelType) {
        this.vehicelType = vehicelType;
    }

    public ParkingTicket getParkingTicket() {
        return parkingTicket;
    }

    public void setParkingTicket(ParkingTicket parkingTicket) {
        this.parkingTicket = parkingTicket;
    }
}
