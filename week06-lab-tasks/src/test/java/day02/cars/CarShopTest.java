package day02.cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarShopTest {

    CarShop carShop = new CarShop("Best Car", 10_000_000);

    List<Car> carsForSell = new ArrayList<>();

    @BeforeEach
    void initList() {

        carShop.addCar(new Car("Toyota", 1.2, Color.BLACK, 2_300_000));
        carShop.addCar(new Car("Lamborghini", 5.2, Color.BLACK, 10_300_000));
        carShop.addCar(new Car("Suzuki", 1.4, Color.RED, 1_500_000));
        carShop.addCar(new Car("Toyota", 1.4, Color.GREY, 2_700_000));
    }

    @Test
    void testCreateCarShop() {

        CarShop carShop = new CarShop("Good Car", 8_000_000);

        assertEquals("Good Car", carShop.getName());
        assertEquals(8_000_000, carShop.getLimitOfPrice());
        assertEquals(0, carShop.getCarsForSell().size());
    }

    @Test
    void testAddCarWithValidPrice() {

        boolean result = carShop.addCar(new Car("Toyota", 1.2, Color.BLACK, 2_300_000));

        assertTrue(result);
        assertEquals(4, carShop.getCarsForSell().size());
        assertEquals("Toyota", carShop.getCarsForSell().get(3).getType());


    }

    @Test
    void testAddCarWithInvalidPrice() {

        boolean result = carShop.addCar(new Car("Lamborghini", 5.2, Color.BLACK, 10_300_000));

        assertFalse(result);
        assertEquals(3, carShop.getCarsForSell().size());
    }

    @Test
    void testSumCarPrice() {

        assertEquals(6_500_000, carShop.sumCarPrice());
    }

    @Test
    void testNumberOfCarsCheaperThan() {

        assertEquals(3, carShop.numberOfCarsCheaperThan(3_000_000));
        assertEquals(0, carShop.numberOfCarsCheaperThan(1_000_000));
    }

    @Test
    void testCarsWithBrand() {

        assertEquals(2, carShop.carsWithBrand("Toyota").size());
        assertEquals(1, carShop.carsWithBrand("Suzuki").size());
        assertEquals(0, carShop.carsWithBrand("Subaru").size());
    }
}