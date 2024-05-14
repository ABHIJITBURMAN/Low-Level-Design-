package ParkingLot.Model;

import ParkingLot.Enums.ParkingSpaceType;
import ParkingLot.Enums.VehicelType;

import java.util.Map;

public class ParkingDisplayBoard {
    Map<VehicelType, Integer> freeSpotAvailable;

    public ParkingDisplayBoard(int twoWheeler, int fourWheeler, int sixWheeler){
        freeSpotAvailable.put(VehicelType.TWO_WHEELER, twoWheeler);
        freeSpotAvailable.put(VehicelType.FOUR_WHEELER,fourWheeler);
        freeSpotAvailable.put(VehicelType.SIX_WHEELER, sixWheeler);
    }
    public void updateFreeSpotAvailable(ParkingSpaceType parkingSpaceType, Integer numberOfSpot){

    }
}
