package Exam;

import java.util.Scanner;

public class Task5_FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String teamName = scanner.nextLine();
        int matchesPlayed = Integer.parseInt(scanner.nextLine());
        int wCount = 0;
        int dCount = 0;
        int lCount = 0;
        int points = 0;
        for (int i = 1; i <= matchesPlayed; i++) {
            char result = scanner.nextLine().charAt(0);
            switch (result) {
                case 'W':
                    points += 3;
                    wCount++;
                    break;
                case 'D':
                    points += 1;
                    dCount++;
                    break;
                case 'L':
                    lCount++;
                    break;
            }
        }
        if (matchesPlayed == 0) {
            System.out.printf("%s hasn't played any games during this season.", teamName);
        } else {
            System.out.printf("%s has won %d points during this season.\nTotal stats:\n", teamName, points);
            System.out.printf("## W: %d\n", wCount);
            System.out.printf("## D: %d\n", dCount);
            System.out.printf("## L: %d\n", lCount);
            System.out.printf("Win rate: %.2f%%", wCount * 1.0 / matchesPlayed * 100);
        }
    }
}
