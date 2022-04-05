package Exam;

import java.util.Scanner;

public class Task3_EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String setSize = scanner.nextLine();
        int numberOfSets = Integer.parseInt(scanner.nextLine());
        double setPrice = 0.00;
        double totalPrice;
        if (setSize.equals("small")) {
            switch (fruit) {
                case "Watermelon":
                    setPrice = 2 * 56;
                    break;
                case "Mango":
                    setPrice = 2 * 36.66;
                    break;
                case "Pineapple":
                    setPrice = 2 * 42.10;
                    break;
                case "Raspberry":
                    setPrice = 2 * 20;
                    break;
            }
        } else if (setSize.equals("big")) {
            switch (fruit) {
                case "Watermelon":
                    setPrice = 5 * 28.70;
                    break;
                case "Mango":
                    setPrice = 5 * 19.60;
                    break;
                case "Pineapple":
                    setPrice = 5 * 24.80;
                    break;
                case "Raspberry":
                    setPrice = 5 * 15.20;
                    break;
            }
        }
        totalPrice = numberOfSets * setPrice;
        if (totalPrice >= 400 && totalPrice <= 1000) {
            totalPrice *= 0.85;
        } else if (totalPrice > 1000) {
            totalPrice *= 0.50;
        }
        System.out.printf("%.2f lv.", totalPrice);
    }
}
