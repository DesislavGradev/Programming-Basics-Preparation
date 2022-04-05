package Exam;

import java.util.Scanner;

public class Task3_CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int numberOfDrinks = Integer.parseInt(scanner.nextLine());
        double drinkPrice = 0.00;

        switch (drink) {
            case "Espresso":
                switch (sugar) {
                    case "Without":
                        drinkPrice = 0.90;
                        drinkPrice *= 0.65;
                        break;
                    case "Normal":
                        drinkPrice = 1.00;
                        break;
                    case "Extra":
                        drinkPrice = 1.20;
                        break;
                }
                break;
            case "Cappuccino":
                switch (sugar) {
                    case "Without":
                        drinkPrice = 1.00;
                        drinkPrice *= 0.65;
                        break;
                    case "Normal":
                        drinkPrice = 1.20;
                        break;
                    case "Extra":
                        drinkPrice = 1.60;
                        break;
                }
                break;
            case "Tea":
                switch (sugar) {
                    case "Without":
                        drinkPrice = 0.50;
                        drinkPrice *= 0.65;
                        break;
                    case "Normal":
                        drinkPrice = 0.60;
                        break;
                    case "Extra":
                        drinkPrice = 0.70;
                        break;
                }
                break;
        }
        if (drink.equals("Espresso") && numberOfDrinks >= 5){
            drinkPrice *= 0.75;
        }
        double totalPrice = numberOfDrinks * drinkPrice;
        if (totalPrice > 15) {
            totalPrice *= 0.80;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", numberOfDrinks, drink, totalPrice);
    }
}
