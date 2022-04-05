import java.util.Scanner;

public class Task3_FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        String moviePackage = scanner.nextLine();
        int ticketsNumber = Integer.parseInt(scanner.nextLine());
        double price = 0.00;

        switch (movieName) {
            case "John Wick":
                switch (moviePackage) {
                    case "Drink":
                        price = 12;
                        break;
                    case "Popcorn":
                        price = 15;
                        break;
                    case "Menu":
                        price = 19;
                        break;
                }
                break;
            case "Star Wars":
                switch (moviePackage) {
                    case "Drink":
                        price = 18;
                        break;
                    case "Popcorn":
                        price = 25;
                        break;
                    case "Menu":
                        price = 30;
                        break;
                }
                if (ticketsNumber >= 4) {
                    price *= 0.70;
                }
                break;
            case "Jumanji":
                switch (moviePackage) {
                    case "Drink":
                        price = 9;
                        break;
                    case "Popcorn":
                        price = 11;
                        break;
                    case "Menu":
                        price = 14;
                        break;
                }
                if (ticketsNumber == 2) {
                    price *= 0.85;
                }
                break;
        }
        System.out.printf("Your bill is %.2f leva.", ticketsNumber * price);
    }
}
