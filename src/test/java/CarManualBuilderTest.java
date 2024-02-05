import org.dp.builder.CarManualBuilder;
import org.dp.director.Director;
import org.dp.model.Manual;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static utils.Util.MANUAL_SPORTIVE_CAR;
import static utils.Util.MANUAL_SUV;

public class CarManualBuilderTest {
    @Test
    public void testCarManualBuilderWithDirector_1() {
        Director director = new Director();
        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.makeSUV(carManualBuilder);

        Manual result = carManualBuilder.getResult();
        Assertions.assertEquals(MANUAL_SUV(), result);
    }

    @Test
    public void testCarManualBuilderWithDirector_2() {
        Director director = new Director();
        CarManualBuilder carBuilder = new CarManualBuilder();
        director.makeSportCar(carBuilder);

        Manual result = carBuilder.getResult();
        Assertions.assertEquals(MANUAL_SPORTIVE_CAR(), result);
    }
}
