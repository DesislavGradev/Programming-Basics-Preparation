package RetakeExam;

import java.util.Scanner;

public class Task6_VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double totalTax = 0.00;

        for (int i = 1; i <= days; i++) {
            double taxPerDay = 0.00;
            for (int j = 1; j <= hours; j++) {
                double taxPerHour = 0.00;
                if (i % 2 != 0 && j % 2 == 0) {
                    taxPerHour = 1.25;
                } else if (i % 2 == 0 && j % 2 != 0) {
                    taxPerHour = 2.50;
                } else {
                    taxPerHour = 1.00;
                }
                taxPerDay += taxPerHour;
            }
            System.out.printf("Day: %d - %.2f leva\n", i, taxPerDay);
            totalTax += taxPerDay;
        }
        System.out.printf("Total: %.2f leva", totalTax);
    }
}
