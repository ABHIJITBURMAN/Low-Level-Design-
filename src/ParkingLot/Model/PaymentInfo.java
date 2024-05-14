package ParkingLot.Model;

import ParkingLot.Enums.PaymentType;

import java.util.Date;

public class PaymentInfo {
    double amount;
    Date paymentDate;
    int paymentId;
    ParkingTicket parkingTicket;
    PaymentType paymentType;

    public PaymentInfo(ParkingTicket parkingTicket, PaymentType paymentType){
        this.parkingTicket = parkingTicket;
        this.paymentType = paymentType;
    }
}
