package Exam;

import java.util.Scanner;

public class Task5_BestPlayer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bestScore = 0;
        String bestPlayer = "";
        for (String playerName = scanner.nextLine(); !(playerName.equals("END")); playerName = scanner.nextLine()) {
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals > bestScore) {
                bestScore = goals;
                bestPlayer = playerName;
            }
            if (goals >= 10) {
                break;
            }
        }

//        int players = Integer.MAX_VALUE;
//        int bestScore = 0;
//        String bestPlayer = "";
//
//        for (int i = 1; i < players; i++) {
//            String playerName = scanner.nextLine();
//            if (playerName.equals("END")){
//                break;
//            }
//            int goals = Integer.parseInt(scanner.nextLine());
//            if (goals > bestScore){
//                bestScore = goals;
//                bestPlayer = playerName;
//            }
//            if (goals >= 10){
//                break;
//            }
//        }
//        System.out.printf("%s is the best player!\n", bestPlayer);
//        if (bestScore >= 3) {
//            System.out.printf("He has scored %d goals and made a hat-trick !!!", bestScore);
//        } else {
//            System.out.printf("He has scored %d goals.", bestScore);
//        }
    }

}
