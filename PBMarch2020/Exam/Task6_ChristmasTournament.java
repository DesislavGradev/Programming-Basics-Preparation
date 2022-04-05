package Exam;

import java.util.Scanner;

public class Task6_ChristmasTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournamentDays = Integer.parseInt(scanner.nextLine());
        double totalMoney = 0.00;


        int totalWonDays = 0;
        for (int i = 1; i <= tournamentDays; i++) {
            int money = 0;
            int winCount = 0;
            int loseCount = 0;
            String input = scanner.nextLine();
            while (!input.equals("Finish")) {
                //String sport = input;
                String result = scanner.nextLine();
                if (result.equals("win")) {
                    money += 20;
                    winCount++;
                } else {
                    loseCount++;
                }
                input = scanner.nextLine();
            }
            if (winCount > loseCount) {
                money *= 1.1;
                totalWonDays++;
            }
            totalMoney += money;
        }
        if (totalWonDays > tournamentDays / 2) {
            totalMoney *= 1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
        }
    }
}
