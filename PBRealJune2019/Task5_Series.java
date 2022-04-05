import java.util.Scanner;

public class Task5_Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int seriesNumber = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0.00;
        for (int i = 1; i <= seriesNumber; i++) {
            String seriesName = scanner.nextLine();
            double seriesPrice = Double.parseDouble(scanner.nextLine());
            switch (seriesName) {
                case "Thrones":
                    seriesPrice *= 0.50;
                    break;
                case "Lucifer":
                    seriesPrice *= 0.60;
                    break;
                case "Protector":
                    seriesPrice *= 0.70;
                    break;
                case "TotalDrama":
                    seriesPrice *= 0.80;
                    break;
                case "Area":
                    seriesPrice *= 0.90;
                    break;
            }
            totalPrice += seriesPrice;
        }
        if (budget >= totalPrice) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget - totalPrice);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", totalPrice - budget);
        }
    }
}
