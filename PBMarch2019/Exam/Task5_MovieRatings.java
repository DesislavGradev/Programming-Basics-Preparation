package Exam;

import java.util.Scanner;

public class Task5_MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int filmsNumber = Integer.parseInt(scanner.nextLine());
        double maxRating = Double.NEGATIVE_INFINITY;
        double minRating = Double.MAX_VALUE;
        String maxRatingFilm = "";
        String minRatingFilm = "";
        double totalRating = 0.00;
        for (int i = 1; i <= filmsNumber; i++) {
            String filmName = scanner.nextLine();
            double filmRating = Double.parseDouble(scanner.nextLine());
            totalRating += filmRating;
            if (filmRating > maxRating) {
                maxRating = filmRating;
                maxRatingFilm = filmName;
            } else if (filmRating < minRating) {
                minRating = filmRating;
                minRatingFilm = filmName;
            }
        }
        System.out.printf("%s is with highest rating: %.1f\n", maxRatingFilm, maxRating);
        System.out.printf("%s is with lowest rating: %.1f\n", minRatingFilm, minRating);
        System.out.printf("Average rating: %.1f", totalRating / filmsNumber);
    }
}
