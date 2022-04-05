package Exam;

import java.util.Scanner;

public class Task3_AluminiumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int joineryNum = Integer.parseInt(scanner.nextLine());
        String joineryType = scanner.nextLine();
        String receiveType = scanner.nextLine();
        double singlePrice = 0;

        if (joineryNum > 10) {
            switch (joineryType) {
                case "90X130":
                    singlePrice = 110;
                    if (joineryNum > 30 && joineryNum <= 60) {
                        singlePrice *= 0.95;
                    } else if (joineryNum > 60) {
                        singlePrice *= 0.92;
                    }
                    break;
                case "100X150":
                    singlePrice = 140;
                    if (joineryNum > 40 && joineryNum <= 80) {
                        singlePrice *= 0.94;
                    } else if (joineryNum > 80) {
                        singlePrice *= 0.90;
                    }
                    break;
                case "130X180":
                    singlePrice = 190;
                    if (joineryNum > 20 && joineryNum <= 50) {
                        singlePrice *= 0.93;
                    } else if (joineryNum > 50) {
                        singlePrice *= 0.88;
                    }
                    break;
                case "200X300":
                    singlePrice = 250;
                    if (joineryNum > 25 && joineryNum <= 50) {
                        singlePrice *= 0.91;
                    } else if (joineryNum > 50) {
                        singlePrice *= 0.86;
                    }
                    break;
            }
            double totalPrice = singlePrice * joineryNum;
            if (receiveType.equals("With delivery")) {
                totalPrice += 60;
            }
            if (joineryNum >= 100) {
                totalPrice *= 0.96;
            }
            System.out.printf("%.2f BGN", totalPrice);
        }else {
            System.out.println("Invalid order");
        }
    }
}
