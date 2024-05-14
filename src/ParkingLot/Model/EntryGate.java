package ParkingLot.Model;

import ParkingLot.Enums.GateType;
import ParkingLot.Enums.VehicelType;

public class EntryGate  extends Gate{
    public EntryGate(int gateId){
        super(gateId, GateType.ENTRY);
    }
    public ParkingTicket getParkingTicket(){
        ParkingTicket ticket = new ParkingTicket(2, 3, VehicelType.TWO_WHEELER);
        return ticket;
    }
}
