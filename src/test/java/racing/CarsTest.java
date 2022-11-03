package racing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.domain.Cars;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarsTest {
    @Test
    @DisplayName("입력된 차 대수 만큼 차 리스트 생성")
    void createCars() {
        String[] carNames = {"pobi","crong","honux","car"};
        Cars cars = new Cars(carNames);

        assertEquals(4, cars.getCars().size());
    }
}