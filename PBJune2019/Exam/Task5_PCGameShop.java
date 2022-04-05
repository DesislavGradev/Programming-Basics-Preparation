package Exam;

import java.util.Scanner;

public class Task5_PCGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soldGames = Integer.parseInt(scanner.nextLine());
        double hearthstoneCount = 0;
        double fortniteCount = 0;
        double overwatchCount = 0;
        double otherCount = 0;
        for (int i = 1; i <= soldGames; i++) {
            String gameName = scanner.nextLine();
            switch (gameName) {
                case "Hearthstone":
                    hearthstoneCount++;
                    break;
                case "Fornite":
                    fortniteCount++;
                    break;
                case "Overwatch":
                    overwatchCount++;
                    break;
                default:
                    otherCount++;
                    break;
            }
        }
        System.out.printf("Hearthstone - %.2f%%\n", hearthstoneCount / soldGames * 100);
        System.out.printf("Fornite - %.2f%%\n", fortniteCount / soldGames * 100);
        System.out.printf("Overwatch - %.2f%%\n", overwatchCount / soldGames * 100);
        System.out.printf("Others - %.2f%%\n", otherCount / soldGames * 100);
    }
}
