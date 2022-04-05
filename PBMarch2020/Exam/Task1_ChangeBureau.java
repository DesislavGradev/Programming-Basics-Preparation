package Exam;

import java.util.Scanner;

public class Task1_ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitCoin = Integer.parseInt(scanner.nextLine());
        double uana = Double.parseDouble(scanner.nextLine());
        double commision = Double.parseDouble(scanner.nextLine());

        double sumInLev = bitCoin * 1168 + uana * 0.15 * 1.76;
        double sumInEuro = sumInLev / 1.95;
        System.out.printf("%.2f", sumInEuro - (commision/100 * sumInEuro));
    }
}
