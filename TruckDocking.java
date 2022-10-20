import java.util.Scanner;

public class TruckDocking {

    Scanner scanner = new Scanner(System.in);
    int selectedOption;


    ParkingManager parking = new ParkingManager();

    public void options() {
        while (selectedOption != 3) {
            System.out.println(" Select an option:\n 1- See parked trucks \n 2- Register a new unloading truck\n 3- Finish");
            selectedOption = scanner.nextInt();
            switch (selectedOption) {

                case 1:
                    parking.showParkedTrucks();
                    break;

                case 2:
                    registerTruck();
                    break;

                case 3:
                    System.out.println("Program is finished.");
                    break;
            }
        }

    }

    private void registerTruck() {
        System.out.println("Select type of truck: \n 1- Van \n 2- Light truck \n 3- Heavy truck \n");
        Scanner option = new Scanner(System.in);
        int truckTypeUserInput = option.nextInt();
        System.out.println("Write weight of truck:");
        int truckWeight = option.nextInt();
        parking.registerTruck(truckTypeUserInput, truckWeight);
    }


}
    
    
