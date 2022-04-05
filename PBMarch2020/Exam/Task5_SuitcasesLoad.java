package Exam;

import java.util.Scanner;

public class Task5_SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double trunkCapacitet = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        int count = 1;
        boolean isFull = false;
        while (!input.equals("End")) {
            double bagVolume = Double.parseDouble(input);
            if (count % 3 == 0) {
                bagVolume *= 1.10;
            }
            if (trunkCapacitet < bagVolume) {
                isFull = true;
                break;
            }
            count++;
            trunkCapacitet -= bagVolume;
            input = scanner.nextLine();
        }
        if (isFull) {
            System.out.println("No more space!");
        } else {
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", count - 1);
    }
}
