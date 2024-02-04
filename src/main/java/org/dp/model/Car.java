package org.dp.model;

import org.dp.model.component.Engine;
import org.dp.model.component.GPS;
import org.dp.model.component.TripComputer;

public class Car {
    private int seats;
    private Engine engine;
    private TripComputer tripComputer;
    private GPS gps;

    public Car() {
    }

    public Car(int seats, Engine engine, TripComputer tripComputer, GPS gps) {
        this.seats = seats;
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.gps = gps;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    public GPS getGps() {
        return gps;
    }

    public void setGps(GPS gps) {
        this.gps = gps;
    }
}
