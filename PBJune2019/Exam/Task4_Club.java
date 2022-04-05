package Exam;

import java.util.Scanner;

public class Task4_Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double desiredProfit = Double.parseDouble(scanner.nextLine());
        String cocktailName = scanner.nextLine();
        boolean targetReached = false;
        double totalProfit = 0.00;
        while (!cocktailName.equals("Party!")) {
            int numberOfCocktails = Integer.parseInt(scanner.nextLine());
            int cocktailPrice = cocktailName.length();
            double orderSum = cocktailPrice * numberOfCocktails;
            if (orderSum % 2 != 0){
                orderSum *= 0.75;
            }
            totalProfit += orderSum;
            if (totalProfit >= desiredProfit) {
                targetReached = true;
                break;
            }
            cocktailName = scanner.nextLine();
        }
        if (!targetReached) {
            System.out.printf("We need %.2f leva more.\n", desiredProfit - totalProfit);
        } else {
            System.out.println("Target acquired.");
        }
        System.out.printf("Club income - %.2f leva.", totalProfit);
    }
}
