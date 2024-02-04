package org.dp.model.component;

import org.dp.model.Car;

public class TripComputer {
    private Car car;

    public TripComputer() {
    }

    public String status() {
        if (this.car.getEngine().isStarted()) {
            return "Car on";
        }
        return "Car off";
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
