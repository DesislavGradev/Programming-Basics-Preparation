package Exam;

import java.util.Scanner;

public class Task3_TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cityName = scanner.nextLine();
        String packageType = scanner.nextLine();
        String vip = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double pricePerDay = 0.00;
        if (days > 7) {
            days--;
        }
        switch (cityName) {
            case "Bansko":
            case "Borovets":
                if (packageType.equals("withEquipment")) {
                    pricePerDay = 100;
                    if (vip.equals("yes")) {
                        pricePerDay *= 0.90;
                    }
                } else if (packageType.equals("noEquipment")) {
                    pricePerDay = 80;
                    if (vip.equals("yes")) {
                        pricePerDay *= 0.95;
                    }
                } else {
                    System.out.print("Invalid input!");
                }
                break;
            case "Varna":
            case "Burgas":
                if (packageType.equals("withBreakfast")) {
                    pricePerDay = 130;
                    if (vip.equals("yes")) {
                        pricePerDay *= 0.88;
                    }
                } else if (packageType.equals("noBreakfast")) {
                    pricePerDay = 100;
                    if (vip.equals("yes")) {
                        pricePerDay *= 0.93;
                    }
                } else {
                    System.out.print("Invalid input!");
                    return;
                }
                break;
            default:
                System.out.print("Invalid input!");
                return;
        }
        if (days < 1) {
            System.out.print("Days must be positive number!");
        } else {
            System.out.printf("The price is %.2flv! Have a nice time!", pricePerDay * days);
        }
    }
}
