package Exam;

import java.util.Scanner;

public class Task4_Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int heigth = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double areaToPaint = 4 * heigth * width;
        areaToPaint -= (areaToPaint * percent * 1.0 / 100);
        boolean isPainted = false;

        while (!input.equals("Tired!")) {
            int liters = Integer.parseInt(input);
            areaToPaint -= liters;
            if (areaToPaint <= 0) {
                isPainted = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (isPainted) {
            if (areaToPaint == 0) {
                System.out.print("All walls are painted! Great job, Pesho!");
            } else {
                System.out.printf("All walls are painted and you have %.0f l paint left!", Math.ceil(Math.abs(areaToPaint)));
            }
        } else {
            System.out.printf("%.0f quadratic m left.", Math.ceil(areaToPaint));
        }
    }
}
