package Exam;

import java.util.Scanner;

public class Task4_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupsNum = Integer.parseInt(scanner.nextLine());
        int musalaPeople = 0;
        int monBlanPeople = 0;
        int kilimanjaroPeople = 0;
        int k2People = 0;
        int everestPeople = 0;
        int totalPeople = 0;

        for (int i = 1; i <= groupsNum; i++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());
            totalPeople += peopleInGroup;
            if (peopleInGroup <= 5) {
                musalaPeople += peopleInGroup;
            } else if (peopleInGroup <= 12) {
                monBlanPeople += peopleInGroup;
            } else if (peopleInGroup <= 25) {
                kilimanjaroPeople += peopleInGroup;
            } else if (peopleInGroup <= 40) {
                k2People += peopleInGroup;
            } else if (peopleInGroup >= 41){
                everestPeople += peopleInGroup;
            }
        }
        System.out.printf("%.2f%%\n", musalaPeople * 100.0 / totalPeople);
        System.out.printf("%.2f%%\n", monBlanPeople * 100.0 / totalPeople);
        System.out.printf("%.2f%%\n", kilimanjaroPeople * 100.0 / totalPeople);
        System.out.printf("%.2f%%\n", k2People * 100.0 / totalPeople);
        System.out.printf("%.2f%%", everestPeople * 100.0 / totalPeople);
    }
}
