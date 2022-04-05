package RetakeExam;

import java.util.Scanner;

public class Task1_FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananas = Double.parseDouble(scanner.nextLine());
        double oranges = Double.parseDouble(scanner.nextLine());
        double raspberries = Double.parseDouble(scanner.nextLine());
        double strawberries = Double.parseDouble(scanner.nextLine());

        double raspberriesPrice = strawberryPrice / 2;
        double orangesPrice = raspberriesPrice * 0.60;
        double bananasPrice = raspberriesPrice * 0.20;
        double totalSum = strawberries * strawberryPrice + bananas * bananasPrice + oranges * orangesPrice + raspberries * raspberriesPrice;
        System.out.printf("%.2f", totalSum);
    }
}
