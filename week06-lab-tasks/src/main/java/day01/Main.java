package day01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PositiveNumberContainer positiveNumberContainer = new PositiveNumberContainer();

        double number;
        while ((number = scanner.nextDouble()) > 0) {
            positiveNumberContainer.addNumbers(number);
        }

        System.out.println(positiveNumberContainer.getPositiveNumbers());
    }
}