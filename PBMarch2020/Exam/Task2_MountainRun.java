package Exam;

import java.util.Scanner;

public class Task2_MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSec = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secForOneMeter = Double.parseDouble(scanner.nextLine());
        double georgeTime = distance * secForOneMeter;
        double slowDownTime = Math.floor(distance / 50) * 30;
        georgeTime += slowDownTime;
        if (georgeTime < recordInSec) {
            System.out.printf("Yes! The new record is %.2f seconds.", georgeTime);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", georgeTime - recordInSec);
        }
    }
}
