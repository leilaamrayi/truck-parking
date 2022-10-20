import java.util.ArrayList;
import java.util.List;

public class ParkingManager {
    private List<AbstractTruck> parkedTrucks = new ArrayList<>();

    int remainedParkingslottA = 0;
    int remainedParkingslottB = 0;
    int remainedParkingslottC = 0;
    int remainedParkingslottD = 0;
    int remainedParkingslottE = 0;

    int truckWeight;
    String parkingslott;

    public void showParkedTrucks() {
        if (parkedTrucks.size() == 0) {
            System.out.println("There is no parked truck yet.");
        } else {
            for (AbstractTruck truck : parkedTrucks) {
                System.out.println(truck);
            }
        }
    }

    public void registerTruck(int truckTypeUserInput, int truckWeight) {
        AbstractTruck truck = new Van();
        if (truckTypeUserInput == 1) {
            truck = new Van();
        } else if (truckTypeUserInput == 2) {
            truck = new LightTruck();
        } else if (truckTypeUserInput == 3) {
            truck = new HeavyTruck();
        }

        truck.setTruckWeight(truckWeight);

        String[] parkingslottLabel = {"parkingslott A", "parkingslott B", "parkingslott C", "parkingslott D", "parkingslott E"};

        if ((truck instanceof Van && remainedParkingslottA <= 4) || (truck instanceof LightTruck && truckWeight < 5000)) {
            parkingslott = parkingslottLabel[0];
            remainedParkingslottA++;
        } else if (truck instanceof Van && remainedParkingslottA > 4 && remainedParkingslottB <= 4) {
            parkingslott = parkingslottLabel[1];
            remainedParkingslottB++;
        } else if (truck instanceof LightTruck && remainedParkingslottC <= 4) {
            parkingslott = parkingslottLabel[2];
            remainedParkingslottC++;
        } else if (truck instanceof LightTruck && remainedParkingslottC > 4 && remainedParkingslottD <= 4) {
            parkingslott = parkingslottLabel[3];
            remainedParkingslottD++;
        } else if ((truck instanceof LightTruck && remainedParkingslottD <= 4) || (truck instanceof HeavyTruck && truckWeight < 9000)) {
            parkingslott = parkingslottLabel[3];
            remainedParkingslottD++;
        } else if (truck instanceof HeavyTruck && remainedParkingslottE >= 4) {
            parkingslott = parkingslottLabel[4];
            remainedParkingslottE++;
        } else {
            System.out.println("Parkingslott is full.");
            return;
        }

        System.out.println("your truck is parked in " + parkingslott);

        truck.setParkingslott(parkingslott);
        parkedTrucks.add(truck);
    }


}
