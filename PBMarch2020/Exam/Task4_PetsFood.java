package Exam;

import java.util.Scanner;

public class Task4_PetsFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalFood = Double.parseDouble(scanner.nextLine());
        int totalDogFood = 0;
        int totalCatFood = 0;
        double biscuits = 0.00;

        for (int i = 1; i <= days; i++) {
            int dogPart = Integer.parseInt(scanner.nextLine());
            int catPart = Integer.parseInt(scanner.nextLine());
            totalDogFood += dogPart;
            totalCatFood += catPart;
            if (i % 3 == 0) {
                biscuits += (dogPart + catPart) * 0.1;
            }
        }
        int eatenFood = totalCatFood + totalDogFood;
        System.out.printf("Total eaten biscuits: %dgr.\n", Math.round(biscuits));
        System.out.printf("%.2f%% of the food has been eaten.\n", eatenFood * 100 / totalFood);
        System.out.printf("%.2f%% eaten from the dog.\n", totalDogFood * 100.0 / eatenFood);
        System.out.printf("%.2f%% eaten from the cat.", totalCatFood * 100.0 / eatenFood);
    }
}
