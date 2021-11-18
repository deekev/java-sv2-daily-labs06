package day04.layered;

import java.util.Scanner;

public class HangmanMain {

    public static void main(String[] args) {
        new HangmanMain().run();
    }

    private void run() {
        BusinessModel businessModel = new BusinessModel("bicikliváz", 8);
        Scanner scanner = new Scanner(System.in);
        do{
            printStatus(businessModel);
            String guess = inputGuess(scanner);
            boolean success = businessModel.takeGuess(guess);
            if (success) {
                System.out.println("Talált.");
            } else {
                System.out.println("Rossz tipp.");
            }
        } while (!businessModel.won() && businessModel.hasMoreChance());
        printResult(businessModel);
    }

    private void printStatus(BusinessModel businessModel) {
        System.out.println("Itt tartasz: " + businessModel.getWordFound());
        System.out.println("Ennyi tipped van: " + businessModel.getChances());
    }

    private String inputGuess(Scanner scanner) {
        System.out.println("Mi a következő tipped?");
        return scanner.nextLine();
    }

    private void printResult(BusinessModel businessModel) {
        if (businessModel.won()) {
            System.out.println(businessModel.getWordFound());
            System.out.println("Ügyes vagy.");
        } else {
            System.out.println("Vesztettél.");
        }
    }
}