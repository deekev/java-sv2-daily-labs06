package day03.numbers;

import java.util.Arrays;
import java.util.Random;

public class Numbers {

//    Adj vissza egy tömbben 5 db 1 és 100 közötti páratlan számot

    public int[] getNumbers() {
        Random random = new Random();
        int[] result = new int[5];
        int count = 0;
        while (count < 5) {
            int number = random.nextInt(100) + 1;
            if (number % 2 == 1) {
                result[count] = number;
                count++;
            }
        }
        return result;
    }


    public static void main(String[] args) {

        Numbers numbers = new Numbers();
        System.out.println(Arrays.toString(numbers.getNumbers()));
    }
}