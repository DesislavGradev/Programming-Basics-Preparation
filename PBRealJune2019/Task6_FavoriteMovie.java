import java.util.Scanner;

public class Task6_FavoriteMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int counter = 0;
        int maxPoints = Integer.MIN_VALUE;
        boolean limitReached = false;
        String bestMovie = "";
        while (!movieName.equals("STOP")) {
            int moviePoints = 0;
            for (int i = 0; i <= movieName.length() - 1; i++) {
                int symbol = movieName.charAt(i);
                if (symbol >= 65 && symbol <= 90) {
                    moviePoints += symbol - movieName.length();
                } else if (symbol >= 97 && symbol <= 122) {
                    moviePoints += symbol - movieName.length() * 2;
                } else {
                    moviePoints += symbol;
                }
            }
            if (maxPoints < moviePoints) {
                maxPoints = moviePoints;
                bestMovie = movieName;
            }
            counter++;
            if (counter >= 7) {
                limitReached = true;
                break;
            }
            movieName = scanner.nextLine();
        }
        if (limitReached) {
            System.out.println("The limit is reached.");
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", bestMovie, maxPoints);
    }
}
