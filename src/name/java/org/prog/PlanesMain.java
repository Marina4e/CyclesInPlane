package org.prog;
public class PlanesMain {
    public static void main(String... args) {
        Plane boeingPlane = new Plane("Boeing", 50);
        Plane aerobusPlane = new Plane("Aerobus", 60);
        boeingPlane.fly("Kyiv");
        aerobusPlane.fly("Maldives");

        Plane ourPlane = new Plane("Boeing", 50);
        String[] passengers = new String[4];
        passengers[0] = "Nik";
        passengers[1] = "Kima";
        passengers[2] = "Sara";
        passengers[3] = "Bill";
        ourPlane.setPassengers(passengers);
        for (int i = 0; i < passengers.length; i++){

        System.out.println("Index of '" + passengers[i] + "' is " + i);
    }
}}
