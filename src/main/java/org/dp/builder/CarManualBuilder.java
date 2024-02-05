package org.dp.builder;

import org.dp.model.Manual;
import org.dp.model.component.Engine;
import org.dp.model.component.GPS;
import org.dp.model.component.TripComputer;

public class CarManualBuilder implements Builder {
    private Manual manual;

    public CarManualBuilder() {
        this.manual = new Manual();
    }

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int number) {
        this.manual.setSeats(number);
    }

    @Override
    public void setEngine(Engine engine) {
        this.manual.setEngine(engine);
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.manual.setTripComputer(tripComputer);
    }

    @Override
    public void setGPS(GPS gps) {
        this.manual.setGps(gps);
    }

    public Manual getResult() {
        return this.manual;
    }
}
