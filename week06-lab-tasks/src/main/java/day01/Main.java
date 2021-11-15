package day01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PositiveNumberContainer positiveNumberContainer = new PositiveNumberContainer();

        System.out.println("Adjon meg egy pozitív számot: ");

        double number = scanner.nextDouble();
        scanner.nextLine();

        while (number > 0) {
            positiveNumberContainer.addNumbers(number);
            System.out.println("Adjon meg egy pozitív számot: ");
            number = scanner.nextDouble();
            scanner.nextLine();
        }

        System.out.println(positiveNumberContainer.getPositiveNumbers());
    }
}