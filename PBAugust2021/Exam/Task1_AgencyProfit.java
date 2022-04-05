package Exam;

import java.util.Scanner;

public class Task1_AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String airline = scanner.nextLine();
        int adultTickets = Integer.parseInt(scanner.nextLine());
        int kidTickets = Integer.parseInt(scanner.nextLine());
        double netPriceAdult = Double.parseDouble(scanner.nextLine());
        double service = Double.parseDouble(scanner.nextLine());

        double adultPrice = netPriceAdult + service;
        double kidPrice = netPriceAdult * 0.30 + service;
        double totalProfit = adultTickets * adultPrice + kidTickets * kidPrice;
        double agencyProfit = totalProfit * 0.20;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", airline, agencyProfit);
    }
}