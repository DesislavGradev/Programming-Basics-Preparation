package Exam;

import java.util.Scanner;

public class Task5_BestPlayer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bestPlayer = "";
        int bestScore = 0;
        String playerName = scanner.nextLine();

        while (!(playerName.equals("END"))) {
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals > bestScore) {
                bestScore = goals;
                bestPlayer = playerName;
            }
            if (goals >= 10) {
                break;
            }
            playerName = scanner.nextLine();
        }
        System.out.printf("%s is the best player!\n", bestPlayer);
        if (bestScore >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", bestScore);
        } else {
            System.out.printf("He has scored %d goals.", bestScore);
        }
    }
}
