package com.company;

public class MyAircraft {

    String model;
    String engine_type;
    int fuel;

    public MyAircraft(String model, String engine_type, int fuel) {
        this.model = model;
        this.engine_type = engine_type;
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "MyAircraft{" +
                "model='" + model + '\'' +
                ", engine_type='" + engine_type + '\'' +
                ", fuel=" + fuel +
                '}';
    }
}
