package Exam;

import java.util.Scanner;

public class Task2_AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bagPriceOver20 = Double.parseDouble(scanner.nextLine());
        double bagKg = Double.parseDouble(scanner.nextLine());
        int daysToTrip = Integer.parseInt(scanner.nextLine());
        int bagNum = Integer.parseInt(scanner.nextLine());
        double bagIncrease = 0.00;

        if (bagKg < 10) {
            bagIncrease = bagPriceOver20 * 0.20;
        } else if (bagKg <= 20) {
            bagIncrease = bagPriceOver20 * 0.50;
        } else {
            bagIncrease = bagPriceOver20;
        }
        if (daysToTrip < 7) {
            bagIncrease *= 1.40;
        } else if (daysToTrip <= 30) {
            bagIncrease *= 1.15;
        } else {
            bagIncrease *= 1.10;
        }
        double bagTax = bagNum * bagIncrease;
        System.out.printf("The total price of bags is: %.2f lv.", bagTax);
    }
}
