public abstract class AbstractTruck {
    protected String truckType;
    private int truckWeight;
    private String parkingslott;

    public String toString() {
        return String.format("%-20s", parkingslott)
                + "Type: " + String.format("%-20s", truckType)
                + "Weight:[" + truckWeight + "kg]";
    }

    public void setTruckWeight(int truckWeight) {
        this.truckWeight = truckWeight;
    }

    public void setParkingslott(String parkingslott) {
        this.parkingslott = parkingslott;
    }

}