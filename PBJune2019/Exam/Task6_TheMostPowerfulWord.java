package Exam;

import java.util.Scanner;

public class Task6_TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int maxValue = Integer.MIN_VALUE;
        String strongest = "";

        while (!word.equals("End of words")) {
            int wordLength = word.length();
            double sum = 0;
            for (int i = 0; i < wordLength; i++) {
                int letterValue = word.charAt(i);
                sum += letterValue;
            }
            char letter = word.charAt(0);
            switch (letter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'Y':
                    sum *= wordLength;
                    break;
                default:
                    sum /= wordLength;
                    sum = Math.floor(sum);
                    break;
            }
            if (maxValue < sum) {
                maxValue = (int) sum;
                strongest = word;
            }
            word = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %d", strongest, maxValue);
    }
}
