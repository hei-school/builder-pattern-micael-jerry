package utils;

import org.dp.model.Car;
import org.dp.model.Manual;
import org.dp.model.component.Engine;
import org.dp.model.component.GPS;
import org.dp.model.component.TripComputer;

public class Util {
    public static Car CAR_SUV() {
        Car car = new Car();
        car.setSeats(4);
        car.setEngine(new Engine(4));
        car.setTripComputer(new TripComputer());
        car.setGps(new GPS());
        return car;
    }

    public static Car CAR_SPORTIVE_CAR() {
        Car car = new Car();
        car.setSeats(2);
        car.setEngine(new Engine(12));
        car.setTripComputer(new TripComputer());
        car.setGps(new GPS());
        return car;
    }

    public static Manual MANUAL_SUV() {
        Manual manual = new Manual();
        manual.setSeats(4);
        manual.setEngine(new Engine(4));
        manual.setTripComputer(new TripComputer());
        manual.setGps(new GPS());
        return manual;
    }

    public static Manual MANUAL_SPORTIVE_CAR() {
        Manual manual = new Manual();
        manual.setSeats(2);
        manual.setEngine(new Engine(12));
        manual.setTripComputer(new TripComputer());
        manual.setGps(new GPS());
        return manual;
    }
}
