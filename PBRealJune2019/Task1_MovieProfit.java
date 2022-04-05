import java.util.Scanner;

public class Task1_MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int numberDays = Integer.parseInt(scanner.nextLine());
        int numberTickets = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        int cinemaPercent = Integer.parseInt(scanner.nextLine());

        double profit = numberDays * numberTickets * ticketPrice;
        double finalProfit = profit - profit * cinemaPercent / 100;

        System.out.printf("The profit from the movie %s is %.2f lv.", movieName, finalProfit);
    }
}
