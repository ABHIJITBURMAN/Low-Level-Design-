package ParkingLot.Model;

import ParkingLot.Enums.GateType;
import ParkingLot.Enums.VehicelType;

public class ExitGate extends Gate{

    public ExitGate(int gateId){
        super(gateId,GateType.EXIT);
    }
    public ParkingTicket payForParkingTicket(){
        ParkingTicket ticket = new ParkingTicket(2, 3, VehicelType.TWO_WHEELER);
        return ticket;
    }
}
