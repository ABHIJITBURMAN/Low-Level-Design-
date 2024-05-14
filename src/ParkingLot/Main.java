package ParkingLot;

import ParkingLot.Enums.VehicelType;
import ParkingLot.Model.ParkingTicket;
import ParkingLot.Model.Vehicle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int floorsNumber = scanner.nextInt();
        int numberOfTwoWheelerSpace = scanner.nextInt();
        int numberOfFourWheelerSpace = scanner.nextInt();
        int numberOfSixWheelerSpace = scanner.nextInt();
        int numberOfEntryGate = scanner.nextInt();
        int numberOfExitGate = scanner.nextInt();
        ParkingLot parkingLot = new ParkingLot(floorsNumber,numberOfTwoWheelerSpace,numberOfFourWheelerSpace,numberOfSixWheelerSpace,numberOfEntryGate, numberOfExitGate);


        Vehicle vehicel1 = new Vehicle("ABCD1234", VehicelType.TWO_WHEELER );

        boolean isSpaceAvailable = parkingLot.isParkingSpaceAvailable(vehicel1);

    }





}

