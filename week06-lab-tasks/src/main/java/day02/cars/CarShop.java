package day02.cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {

    private String name;
    private int limitOfPrice;
    private List<Car> carsForSell = new ArrayList<>();

    public CarShop(String name, int limitOfPrice) {
        this.name = name;
        this.limitOfPrice = limitOfPrice;
    }

    public String getName() {
        return name;
    }

    public int getLimitOfPrice() {
        return limitOfPrice;
    }

    public List<Car> getCarsForSell() {
        return carsForSell;
    }

    public boolean addCar(Car car) {
        if (car.getPrice() <= limitOfPrice) {
            carsForSell.add(car);
            return true;
        }
        return false;
    }

    public int sumCarPrice() {
        int sumPrice = 0;
        for (Car actual: carsForSell) {
            sumPrice += actual.getPrice();
        }
        return sumPrice;
    }

    public int numberOfCarsCheaperThan(int price) {
        int numberOfCars = 0;
        for (Car actual: carsForSell) {
            if (actual.getPrice() < price) {
                numberOfCars++;
            }
        }
        return numberOfCars;
    }

    public List<Car> carsWithBrand(String brand) {
        List<Car> sameBrandCars = new ArrayList<>();
        for (Car actual: carsForSell) {
            if (brand.equals(actual.getType())) {
                sameBrandCars.add(actual);
            }
        }
        return sameBrandCars;
    }
}