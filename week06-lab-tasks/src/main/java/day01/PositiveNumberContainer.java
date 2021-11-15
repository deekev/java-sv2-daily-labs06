package day01;

import java.util.ArrayList;
import java.util.List;

public class PositiveNumberContainer {

    private List<Double> positiveNumbers = new ArrayList<>();

    public void addNumbers(double number) {
        positiveNumbers.add(number);
    }

    public List<Double> getPositiveNumbers() {
        return positiveNumbers;
    }
}
