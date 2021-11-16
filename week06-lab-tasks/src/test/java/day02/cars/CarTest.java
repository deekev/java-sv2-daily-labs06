package day02.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {

    @Test
    void testCreateCar() {

        Car car = new Car("Suzuki", 1.3, Color.GREY, 950_000);

        assertEquals("Suzuki", car.getType());
        assertEquals(1.3, car.getSizeOfMotor());
        assertEquals(Color.GREY, car.getColor());
        assertEquals(950_000, car.getPrice());
    }

    @Test
    void testDecreasePrice() {

        Car car = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);

        car.decreasePrice(10);
        assertEquals(2_070_000, car.getPrice());

        car.decreasePrice(50);
        assertEquals(1_035_000, car.getPrice());
    }
}