package org.prog;

public class Plane {
    public String planeManufacturerName;
    public int countPassengers;

    public String passengerList;
    public String getPassenger(int index){return passengerList;
    }

    public Plane(String ManufacturerName, int passengers){
        planeManufacturerName = ManufacturerName;
        countPassengers = passengers;
    }
    public void fly(String direction){
        System.out.println(planeManufacturerName + " is flying to " + direction +
                " with " +countPassengers +" passengers!");
    }
    public String[] passengers = new String[4];
    public void setPassengers(String[]passengers) {

}


}
