import org.dp.builder.CarBuilder;
import org.dp.director.Director;
import org.dp.model.Car;
import org.dp.model.component.Engine;
import org.dp.model.component.TripComputer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static utils.Util.CAR_SPORTIVE_CAR;
import static utils.Util.CAR_SUV;

public class CarBuilderTest {

    @Test
    public void testCarBuilder() {
        CarBuilder carBuilder = new CarBuilder();
        carBuilder.setEngine(new Engine(6));
        carBuilder.setTripComputer(new TripComputer());

        Car result = carBuilder.getResult();
        Assertions.assertEquals(new Engine(6), result.getEngine());
        Assertions.assertEquals(result.getTripComputer(), result.getTripComputer());
    }

    @Test
    public void testCarBuilderWithDirector_1() {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.makeSUV(carBuilder);

        Car result = carBuilder.getResult();
        Assertions.assertEquals(CAR_SUV(), result);
    }

    @Test
    public void testCarBuilderWithDirector_2() {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.makeSportCar(carBuilder);

        Car result = carBuilder.getResult();
        Assertions.assertEquals(CAR_SPORTIVE_CAR(), result);
    }
}
