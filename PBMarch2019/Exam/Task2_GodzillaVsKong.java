package Exam;

import java.util.Scanner;

public class Task2_GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double filmBudget = Double.parseDouble(scanner.nextLine());
        int statistsNum = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());

        if (statistsNum > 150) {
            clothesPrice *= 0.90;
        }
        double neededMoney = statistsNum * clothesPrice + filmBudget * 0.10;

        if (neededMoney > filmBudget) {
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.", neededMoney - filmBudget);
        } else {
            System.out.printf("Action!\nWingard starts filming with %.2f leva left.", filmBudget - neededMoney);
        }
    }
}
