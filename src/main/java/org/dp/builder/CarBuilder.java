package org.dp.builder;

import org.dp.model.Car;
import org.dp.model.component.Engine;
import org.dp.model.component.GPS;
import org.dp.model.component.TripComputer;

public class CarBuilder implements Builder {
    private Car car;
    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int number) {
        this.car.setSeats(number);
    }

    @Override
    public void setEngine(Engine engine) {
        this.car.setEngine(engine);
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.car.setTripComputer(tripComputer);
    }

    @Override
    public void setGPS(GPS gps) {
        this.car.setGps(gps);
    }

    public Car getResult() {
        return this.car;
    }
}
