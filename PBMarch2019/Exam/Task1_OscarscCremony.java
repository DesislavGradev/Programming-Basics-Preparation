package Exam;

import java.util.Scanner;

public class Task1_OscarscCremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rentHall = Integer.parseInt(scanner.nextLine());
        double statuette = rentHall * 0.70;
        double catering = statuette * 0.85;
        double sound = catering / 2;

        System.out.printf("%.2f", rentHall + statuette + catering + sound);
    }
}
