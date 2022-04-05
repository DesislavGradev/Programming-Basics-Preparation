package Exam;

import java.util.Scanner;

public class Task2_CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesWalk = Integer.parseInt(scanner.nextLine());
        int numberWalks = Integer.parseInt(scanner.nextLine());
        int catCalories = Integer.parseInt(scanner.nextLine());
        int caloriesBurned = minutesWalk * numberWalks * 5;
        if (caloriesBurned >= catCalories /2 ) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", caloriesBurned);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", caloriesBurned);
        }
    }
}
