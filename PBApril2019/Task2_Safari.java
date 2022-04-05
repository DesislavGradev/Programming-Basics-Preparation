package RetakeExam;

import java.util.Scanner;

public class Task2_Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double litersNeeded = Double.parseDouble(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        double fuel = litersNeeded * 2.10;
        double neededMoney = fuel + 100;

        if (dayOfWeek.equals("Saturday")) {
            neededMoney *= 0.90;
        } else if (dayOfWeek.equals("Sunday")) {
            neededMoney *= 0.80;
        }
        if (budget >= neededMoney) {
            System.out.printf("Safari time! Money left: %.2f lv.", budget- neededMoney);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", neededMoney - budget);
        }
    }
}
