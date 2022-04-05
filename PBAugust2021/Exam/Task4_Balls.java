package Exam;

import java.util.Scanner;

public class Task4_Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ballsNum = Integer.parseInt(scanner.nextLine());
        double totalPoints = 0;
        int otherColors = 0;
        int redBalls = 0;
        int orangeBalls = 0;
        int yellowBalls = 0;
        int whiteBalls = 0;
        int blackBalls = 0;


        for (int i = 1; i <= ballsNum; i++) {
            String ballColor = scanner.nextLine();
            switch (ballColor) {
                case "red":
                    redBalls++;
                    totalPoints += 5;
                    break;
                case "orange":
                    orangeBalls++;
                    totalPoints += 10;
                    break;
                case "yellow":
                    yellowBalls++;
                    totalPoints += 15;
                    break;
                case "white":
                    whiteBalls++;
                    totalPoints += 20;
                    break;
                case "black":
                    blackBalls++;
                    totalPoints = Math.floor(totalPoints / 2);
                    break;
                default:
                    otherColors += 1;
                    break;
            }
        }
        System.out.printf("Total points: %.0f\n", totalPoints);
        System.out.printf("Points from red balls: %d\n", redBalls);
        System.out.printf("Points from orange balls: %d\n", orangeBalls);
        System.out.printf("Points from yellow balls: %d\n", yellowBalls);
        System.out.printf("Points from white balls: %d\n", whiteBalls);
        System.out.printf("Other colors picked: %d\n", otherColors);
        System.out.printf("Divides from black balls: %d", blackBalls);
    }
}
