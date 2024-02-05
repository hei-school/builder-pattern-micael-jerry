package org.dp.model.component;

import org.dp.model.Car;

import java.util.Objects;

public class TripComputer {
    private Car car;

    public TripComputer() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TripComputer that)) return false;
        return Objects.equals(getCar(), that.getCar());
    }

    @Override
    public String toString() {
        return "TripComputer{" +
                "car=" + car +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCar());
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
