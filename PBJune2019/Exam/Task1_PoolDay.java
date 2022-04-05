package Exam;

import java.util.Scanner;

public class Task1_PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        double entrancePrice = Double.parseDouble(scanner.nextLine());
        double sunbedPrice = Double.parseDouble(scanner.nextLine());
        double umbrellaPrice = Double.parseDouble(scanner.nextLine());
        double totalMoney = numberOfPeople * entrancePrice + Math.ceil(numberOfPeople * 0.75) * sunbedPrice +
                             Math.ceil(numberOfPeople * 1.00 / 2) * umbrellaPrice;
        System.out.printf("%.2f lv.", totalMoney);
    }
}
