package com.company;

public class AircraftBuilder {
    String model;
    String engine_type;
    int fuel;

    public AircraftBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public AircraftBuilder setEngine_type(String engine_type) {
        this.engine_type = engine_type;
        return this;
    }

    public AircraftBuilder setFuel(int fuel) {
        this.fuel = fuel;
        return this;
    }

    public MyAircraft getInstance() {
        return new MyAircraft(model, engine_type, fuel);
    }

}
