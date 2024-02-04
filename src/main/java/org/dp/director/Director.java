package org.dp.director;

import org.dp.builder.Builder;
import org.dp.model.component.Engine;
import org.dp.model.component.GPS;
import org.dp.model.component.TripComputer;

public class Director {
    public void makeSUV(Builder builder) {
        builder.reset();
        builder.setSeats(4);
        builder.setEngine(new Engine(4));
        builder.setTripComputer(new TripComputer());
        builder.setGPS(new GPS());
    }

    public void makeSportCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new Engine(12));
        builder.setTripComputer(new TripComputer());
        builder.setGPS(new GPS());
    }
}
