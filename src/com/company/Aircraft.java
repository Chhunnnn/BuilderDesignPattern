package com.company;

public class Aircraft {
    public static void main(String[] args) {
        MyAircraft ma = new AircraftBuilder()
                .setModel("Airbus A380")
                .setEngine_type("Roll Royce")
                .getInstance();

        System.out.println(ma.toString());
    }
}
