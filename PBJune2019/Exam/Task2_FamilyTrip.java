package Exam;

import java.util.Scanner;

public class Task2_FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numberOvernights = Integer.parseInt(scanner.nextLine());
        double overnightPrice = Double.parseDouble(scanner.nextLine());
        int additionalExpensesPercent = Integer.parseInt(scanner.nextLine());
        if (numberOvernights > 7) {
            overnightPrice *= 0.95;
        }
        double neededMoney = numberOvernights * overnightPrice + budget * additionalExpensesPercent / 100;
        if (neededMoney <= budget) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - neededMoney);
        } else {
            System.out.printf("%.2f leva needed.", neededMoney - budget);
        }
    }
}