package ParkingLot.Model;

import ParkingLot.Enums.ParkingSpaceType;
import ParkingLot.Enums.VehicelType;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    int floorId;
    List<ParkingSpace> parkingSpaces;
    boolean isFull;
    ParkingDisplayBoard parkingDisplayBoard;

    public int getFloorId() {
        return floorId;
    }

    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }

    public List<ParkingSpace> getParkingSpaces() {
        return parkingSpaces;
    }

    public void setParkingSpaces(List<ParkingSpace> parkingSpaces) {
        this.parkingSpaces = parkingSpaces;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public ParkingDisplayBoard getParkingDisplayBoard() {
        return parkingDisplayBoard;
    }

    public void setParkingDisplayBoard(ParkingDisplayBoard parkingDisplayBoard) {
        this.parkingDisplayBoard = parkingDisplayBoard;
    }

    public ParkingFloor(int floorId, int twoWheelerSpace, int fourWheelerSpace, int sixWheelerSpace){
        this.floorId = floorId;
        this.parkingSpaces = buildingParkingSpace(twoWheelerSpace,fourWheelerSpace, sixWheelerSpace);
        this.isFull = false;


    }
    List<ParkingSpace> buildingParkingSpace( int twoWheelerSpace, int fourWheelerSpace, int sixWheelerSpace){
        List<ParkingSpace> spaceList = new ArrayList<>();
        for(int i =0; i<twoWheelerSpace; i++){
            ParkingSpace p = new ParkingSpace(i, VehicelType.TWO_WHEELER);
            spaceList.add(p);
        }
        for(int i =0; i<fourWheelerSpace; i++){
            ParkingSpace p = new ParkingSpace(i, VehicelType.FOUR_WHEELER);
            spaceList.add(p);
        }
        for(int i =0; i<sixWheelerSpace; i++){
            ParkingSpace p = new ParkingSpace(i, VehicelType.SIX_WHEELER);
            spaceList.add(p);
        }
        return spaceList;
    }

//    public boolean checkParkingSpaceAvailable(VehicelType vehicelType, int floorId){
//
//    }

}
