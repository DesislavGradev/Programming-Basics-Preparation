package Exam;

import java.util.Scanner;

public class Task6_NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int maxPoints = Integer.MIN_VALUE;
        String winnner = "";
        while (!name.equals("Stop")) {
            int points = 0;
            for (int i = 0; i < name.length() ; i++) {
                int number = Integer.parseInt(scanner.nextLine());
                if (number == name.charAt(i)) {
                    points += 10;
                } else {
                    points += 2;
                }
            }
            if (points >= maxPoints) {
                maxPoints = points;
                winnner = name;
            }
            name = scanner.nextLine();
        }
        System.out.printf("The winner is %s with %d points!", winnner, maxPoints);
    }
}
