package RetakeExam;

import java.util.Scanner;

public class Task4_TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String productName = scanner.nextLine();
        int count = 0;
        double spentMoney = 0.00;
        boolean outOfMoney = false;
        double productPrice = 0.00;

        while (!productName.equals("Stop")){
            productPrice = Double.parseDouble(scanner.nextLine());
            count++;
            if (count % 3 == 0) {
                productPrice /= 2;
            }
            if (budget < productPrice){
                outOfMoney = true;
                break;
            }
            budget -= productPrice;
            spentMoney += productPrice;
            productName = scanner.nextLine();
        }
        if (outOfMoney){
            System.out.printf("You don't have enough money!\nYou need %.2f leva!", productPrice - budget);
        } else {
            System.out.printf("You bought %d products for %.2f leva.", count, spentMoney);
        }
    }
}
