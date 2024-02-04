package org.dp.builder;

import org.dp.model.component.Engine;
import org.dp.model.component.GPS;
import org.dp.model.component.TripComputer;

public interface Builder {
    void reset();

    void setSeats(int number);

    void setEngine(Engine engine);

    void setTripComputer(TripComputer tripComputer);

    void setGPS(GPS gps);
}