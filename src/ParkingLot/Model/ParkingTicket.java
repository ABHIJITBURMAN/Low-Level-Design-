package ParkingLot.Model;

import ParkingLot.Enums.ParkingTicketStatus;
import ParkingLot.Enums.PaymentType;
import ParkingLot.Enums.VehicelType;

public class ParkingTicket {
    int ticketId;
    int floorId;
    int spaceId;
    int entryTime;
    int exitTime;
    PaymentType paymentType;
    VehicelType vehicelType;
    ParkingTicketStatus parkingTicketStatus;


    public ParkingTicket(int floorId, int spaceId, VehicelType vehicelType ){
        this.floorId = floorId;
        this.spaceId = spaceId;
        this.vehicelType = vehicelType;
        this.parkingTicketStatus = ParkingTicketStatus.ACTIVE;
        this.paymentType = PaymentType.UPI;


    }

    public void updateTotalCost(){

    }

    public void updateVehicleExitTime(int exitTime){

    }



}
