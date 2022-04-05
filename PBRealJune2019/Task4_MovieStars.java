import java.util.Scanner;

public class Task4_MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String actorName = scanner.nextLine();
        boolean outOfBudget = false;
        double actorPayment = 0.00;
        while (!actorName.equals("ACTION")) {
            if (actorName.length() > 15) {
                budget *= 0.80;
            } else {
                actorPayment = Double.parseDouble(scanner.nextLine());
                if (budget - actorPayment < 0) {
                    outOfBudget = true;
                    break;
                }
                budget -= actorPayment;
            }
            actorName = scanner.nextLine();
        }
        if (!outOfBudget) {
            System.out.printf("We are left with %.2f leva.", budget);
        } else {
            System.out.printf("We need %.2f leva for our actors.", actorPayment - budget);
        }
    }
}
