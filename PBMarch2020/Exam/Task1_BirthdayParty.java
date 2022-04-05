package Exam;

import java.util.Scanner;

public class Task1_BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rent = Double.parseDouble(scanner.nextLine());
        double cake = rent * 0.20;
        double drinks = cake * 0.55;
        double animator = rent / 3;
        System.out.printf("%.1f", rent + cake + drinks + animator);
    }
}
