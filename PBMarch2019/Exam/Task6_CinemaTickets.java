package Exam;

import java.util.Scanner;

public class Task6_CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int totalTickets = 0;
        double studentCounter = 0.00;
        double standardCounter = 0.00;
        double kidCounter = 0.00;

        while (!movieName.equals("Finish")) {
            int availableSeats = Integer.parseInt(scanner.nextLine());
            String ticketType = scanner.nextLine();
            int takenSeats = 0;
            while (!ticketType.equals("End")) {
                switch (ticketType) {
                    case "student":
                        studentCounter++;
                        break;
                    case "standard":
                        standardCounter++;
                        break;
                    case "kid":
                        kidCounter++;
                        break;
                }
                takenSeats++;
                totalTickets++;
                if (takenSeats == availableSeats) {
                    break;
                }
                ticketType = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.\n", movieName, takenSeats * 1.00 / availableSeats * 100);
            movieName = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d\n", totalTickets);
        System.out.printf("%.2f%% student tickets.\n", studentCounter / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.\n", standardCounter / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", kidCounter / totalTickets * 100);
    }
}

