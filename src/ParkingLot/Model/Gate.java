package ParkingLot.Model;

import ParkingLot.Enums.GateType;

public class Gate {
    int gatId;
    GateType gateType;

    Gate(int gateId, GateType gateType){
        this.gatId = gateId;
        this.gateType = gateType;
    }
}
