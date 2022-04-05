package Exam;

import java.util.Scanner;

public class Task5_PuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalEatenFood = 0;
        int boughtFood = Integer.parseInt(scanner.nextLine()) * 1000;
        String input = scanner.nextLine();
        while (!input.equals("Adopted")) {
            int eatenFood = Integer.parseInt(input);
            totalEatenFood += eatenFood;
            input = scanner.nextLine();
        }
        if (totalEatenFood <= boughtFood) {
            System.out.printf("Food is enough! Leftovers: %d grams.", boughtFood - totalEatenFood);
        }else {
            System.out.printf("Food is not enough. You need %d grams more.", totalEatenFood - boughtFood);
        }
    }
}
