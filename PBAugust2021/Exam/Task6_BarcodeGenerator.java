package Exam;

import java.util.Scanner;

public class Task6_BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        int num1_4 = num1 % 10;
        int num1_3 = (num1 % 100) / 10;
        int num1_2 = (num1 % 1000) / 100;
        int num1_1 = num1 / 1000;

        int num2_4 = num2 % 10;
        int num2_3 = (num2 % 100) / 10;
        int num2_2 = (num2 % 1000) / 100;
        int num2_1 = num2 / 1000;

        for (int i = num1_1; i <= num2_1; i++) {
            if (i % 2 != 0) {
                for (int j = num1_2; j <= num2_2; j++) {
                    if (j % 2 != 0) {
                        for (int k = num1_3; k <= num2_3; k++) {
                            if (k % 2 != 0) {
                                for (int l = num1_4; l <= num2_4; l++) {
                                    if (l % 2 != 0) {
                                        System.out.printf("%d", i);
                                        System.out.printf("%d", j);
                                        System.out.printf("%d", k);
                                        System.out.printf("%d ", l);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
