package ParkingLot;

import ParkingLot.Enums.GateType;
import ParkingLot.Enums.VehicelType;
import ParkingLot.Model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParkingLot {
    int floorsNumber;
    int numberOfTwoWheelerSpace;
    int numberOfFourWheelerSpace;
    int numberOfSixWheelerSpace;
    List<ParkingFloor> parkingFloors;
    List<EntryGate> entryGates = new ArrayList<>();
    List<ExitGate> exitGates = new ArrayList<>();
    List<ParkingDisplayBoard> parkingDisplayBoards;

    List<Vehicle> vehicleList;

    int uniqueNumber;
    public ParkingLot(int floorsNumber,int numberOfTwoWheelerSpace,int numberOfFourWheelerSpace,int numberOfSixWheelerSpace, int numberOfEntryGate, int numberOfExitGate){
        this.floorsNumber = floorsNumber;
        this.numberOfTwoWheelerSpace = numberOfTwoWheelerSpace;
        this.numberOfFourWheelerSpace = numberOfFourWheelerSpace;
        this.numberOfSixWheelerSpace = numberOfSixWheelerSpace;
        this.parkingFloors = buildingparkingFloors(floorsNumber, numberOfTwoWheelerSpace, numberOfFourWheelerSpace, numberOfSixWheelerSpace);
        buildingGates(numberOfEntryGate, numberOfExitGate);
        this.parkingDisplayBoards = buildingParkingDisplayBoard(floorsNumber, numberOfTwoWheelerSpace, numberOfFourWheelerSpace, numberOfSixWheelerSpace);

    }
    List<ParkingFloor> buildingparkingFloors(int floorsNumber,int numberOfTwoWheelerSpace,int numberOfFourWheelerSpace,int numberOfSixWheelerSpace){
        List<ParkingFloor> floorsList = new ArrayList<>();
        for (int i = 0; i < floorsNumber ; i++) {
            ParkingFloor p = new ParkingFloor(i, numberOfTwoWheelerSpace, numberOfFourWheelerSpace, numberOfSixWheelerSpace);
            floorsList.add(p);
        }
        return floorsList;
    }

    void buildingGates(int numberOfEntryGates, int numberOfExitGates){
        int gateId = 0;
        while(numberOfEntryGates>0){
            this.entryGates.add(new EntryGate(gateId));
            numberOfEntryGates--;
            gateId++;
        }
        while(numberOfExitGates>0){
            this.exitGates.add(new ExitGate(gateId));
            numberOfExitGates--;
            gateId++;
        }
    }

    List<ParkingDisplayBoard> buildingParkingDisplayBoard(int floorsNumber, int numberOfTwoWheelerSpace,int numberOfFourWheelerSpace,int numberOfSixWheelerSpace){
        List<ParkingDisplayBoard> displayBoards = new ArrayList<>();
        for(int i = 0; i < floorsNumber; i++){
            displayBoards.add(new ParkingDisplayBoard(numberOfTwoWheelerSpace, numberOfFourWheelerSpace, numberOfSixWheelerSpace));
        }
        return displayBoards;
    }

    public boolean isParkingSpaceAvailable(Vehicle vehicle){
        VehicelType vehicelType = vehicle.getVehicelType();
        for(int i = 0; i<this.floorsNumber;i++){
            List<ParkingSpace> parkingSpacesList =  this.parkingFloors.get(i).getParkingSpaces();
            for(int j=0;j<parkingSpacesList.size(); j++){
                ParkingSpace parkingSpace = parkingSpacesList.get(j);
                if(parkingSpace.isBooked() == false && parkingSpace.getVehicelType() == vehicelType){
                    parkingSpace.setBooked(true);
                    parkingSpace.setVehicle(vehicle);
                    this.vehicleList.add(vehicle);
                    ParkingTicket parkingTicket = new ParkingTicket(i,j,vehicle.getVehicelType());
                    vehicle.setParkingTicket(parkingTicket);
                    return true;
                }
            }

        }
        return false;
    }

}
