package Exam;

import java.util.Scanner;

public class Task4_CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucherSum = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int ticket = 0;
        int product = 0;
  //      boolean voucherEnd = false;

        while (!input.equals("End")){
            String purchase = input;
            int productPrice = 0;
            boolean isTicket = false;
            if (purchase.length() > 8) {
                isTicket = true;
                productPrice = purchase.charAt(0) + purchase.charAt(1);
            } else {
                productPrice = purchase.charAt(0);
            }
            if (productPrice <= voucherSum) {
                voucherSum -= productPrice;
                if (isTicket) {
                    ticket++;
                } else {
                    product++;
                }
            } else {
       //         voucherEnd = true;
                break;
            }
            input = scanner.nextLine();
        }
        System.out.println(ticket);
        System.out.print(product);
    }
}
