package RetakeExam;

import java.util.Scanner;

public class Task3_MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String contractPeriod = scanner.nextLine();
        String contractType = scanner.nextLine();
        String addedInternet = scanner.nextLine();
        int monthsToPay = Integer.parseInt(scanner.nextLine());
        double pricePerMonth = 0.00;

        if (contractPeriod.equals("one")){
            switch (contractType) {
                case "Small":
                    pricePerMonth = 9.98;
                    break;
                case "Middle":
                    pricePerMonth = 18.99;
                    break;
                case "Large":
                    pricePerMonth = 25.98;
                    break;
                case "ExtraLarge":
                    pricePerMonth = 35.99;
                    break;
            }
        } else {
            switch (contractType) {
                case "Small":
                    pricePerMonth = 8.58;
                    break;
                case "Middle":
                    pricePerMonth = 17.09;
                    break;
                case "Large":
                    pricePerMonth = 23.59;
                    break;
                case "ExtraLarge":
                    pricePerMonth = 31.79;
                    break;
            }
        }
        if (addedInternet.equals("yes")){
            if (pricePerMonth <= 10) {
                pricePerMonth += 5.50;
            } else if (pricePerMonth <= 30) {
                pricePerMonth += 4.35;
            } else {
                pricePerMonth += 3.85;
            }
        }
        if (contractPeriod.equals("two")){
            pricePerMonth *= 0.9625;
        }
        System.out.printf("%.2f lv.", pricePerMonth * monthsToPay);
    }
}
