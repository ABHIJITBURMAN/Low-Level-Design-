package ParkingLot.Model;

import ParkingLot.Enums.PaymentType;

public class Payment {

    public PaymentInfo makePayment(ParkingTicket parkingTicket, PaymentType paymentType){
        PaymentInfo paymentInfo = new PaymentInfo(parkingTicket, paymentType);
        return  paymentInfo;
    }
}
