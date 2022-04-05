import java.util.Scanner;

public class Task3_MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int numberDays = Integer.parseInt(scanner.nextLine());
        int costPerDay = 0;
        int totalCost;

        switch (destination) {
            case "Dubai":
                switch (season){
                    case "Summer":
                        costPerDay = 40000;
                        break;
                    case "Winter":
                        costPerDay = 45000;
                        break;
                }
                break;
            case "Sofia":
                switch (season){
                    case "Summer":
                        costPerDay = 12500;
                        break;
                    case "Winter":
                        costPerDay = 17000;
                        break;
                }
                break;
            case "London":
                switch (season){
                    case "Summer":
                        costPerDay = 20250;
                        break;
                    case "Winter":
                        costPerDay = 24000;
                        break;
                }
                break;
        }
        totalCost = costPerDay * numberDays;
        if (destination.equals("Dubai")) {
            totalCost *= 0.70;
        } else if (destination.equals("Sofia")) {
            totalCost *= 1.25;
        }
        if (budget >= totalCost) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - totalCost);
        } else {
            System.out.printf("The director needs %.2f leva more!", totalCost - budget);
        }
    }
}
