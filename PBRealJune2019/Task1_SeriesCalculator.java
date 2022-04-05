import java.util.Scanner;

public class Task1_SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        int numberSeasons = Integer.parseInt(scanner.nextLine());
        int numberEpisodes = Integer.parseInt(scanner.nextLine());
        double episodeDuration = Double.parseDouble(scanner.nextLine());

        double episodePlusAds = episodeDuration * 0.2 + episodeDuration;
        double totalDuration = Math.floor(numberSeasons * numberEpisodes * episodePlusAds + numberSeasons * 10);
        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", seriesName, totalDuration);
    }
}
