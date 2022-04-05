import java.util.Scanner;

public class Task5_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int judgesNumber = Integer.parseInt(scanner.nextLine());
        double totalPoints = academyPoints;
        boolean isNominated = false;

        for (int i = 1; i <= judgesNumber; i++) {
            String judgeName = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());
            totalPoints += judgeName.length() * judgePoints / 2;
            if (totalPoints > 1250.5) {
                isNominated = true;
                break;
            }
        }
        if (isNominated) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - totalPoints);
        }
    }
}
