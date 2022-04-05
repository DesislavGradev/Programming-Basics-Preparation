package Exam;

import java.util.Scanner;

public class Task3_OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filmName = scanner.nextLine();
        String hallType = scanner.nextLine();
        int boughtTickets = Integer.parseInt(scanner.nextLine());
        double income = 0.00;
        switch (filmName) {
            case "A Star Is Born":
                switch (hallType) {
                    case "normal":
                        income = boughtTickets * 7.50;
                        break;
                    case "luxury":
                        income = boughtTickets * 10.50;
                        break;
                    case "ultra luxury":
                        income = boughtTickets * 13.50;
                        break;
                }
                break;
            case "Bohemian Rhapsody":
                switch (hallType) {
                    case "normal":
                        income = boughtTickets * 7.35;
                        break;
                    case "luxury":
                        income = boughtTickets * 9.45;
                        break;
                    case "ultra luxury":
                        income = boughtTickets * 12.75;
                        break;
                }
                break;
            case "Green Book":
                switch (hallType) {
                    case "normal":
                        income = boughtTickets * 8.15;
                        break;
                    case "luxury":
                        income = boughtTickets * 10.25;
                        break;
                    case "ultra luxury":
                        income = boughtTickets * 13.25;
                        break;
                }
                break;
            case "The Favourite":
                switch (hallType) {
                    case "normal":
                        income = boughtTickets * 8.75;
                        break;
                    case "luxury":
                        income = boughtTickets * 11.55;
                        break;
                    case "ultra luxury":
                        income = boughtTickets * 13.95;
                        break;
                }
                break;
        }
        System.out.printf("%s -> %.2f lv.", filmName, income);
    }
}
