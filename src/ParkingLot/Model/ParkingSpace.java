package ParkingLot.Model;

import ParkingLot.Enums.ParkingSpaceType;
import ParkingLot.Enums.VehicelType;

public class ParkingSpace {
    int spaceId;
    boolean isBooked;
    double costPerHour;

    Vehicle vehicle;
    VehicelType vehicelType;
    public int getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(int spaceId) {
        this.spaceId = spaceId;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public VehicelType getVehicelType() {
        return vehicelType;
    }

    public void setParkingSpaceType(VehicelType vehicelType) {
        this.vehicelType = vehicelType;
    }



    public ParkingSpace(int spaceId, VehicelType vehicelType){
        this.spaceId = spaceId;
        this.isBooked = false;
        this.costPerHour = 10.0;
        this.vehicelType = vehicelType;
    }
}
