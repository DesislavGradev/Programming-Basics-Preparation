import java.util.Scanner;

public class Task4_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hallCapacity = Integer.parseInt(scanner.nextLine());
        String fullHall = scanner.nextLine();
        int income = 0;
        boolean isFull = false;
        while (!fullHall.equals("Movie time!")) {
            int peopleEntering = Integer.parseInt(fullHall);
            if (peopleEntering > hallCapacity) {
                isFull = true;
                break;
            }
            hallCapacity -= peopleEntering;
            if (peopleEntering % 3 == 0) {
                income += peopleEntering * 5 - 5;
            } else {
                income += peopleEntering * 5;
            }
            fullHall = scanner.nextLine();
        }
        if (isFull) {
            System.out.println("The cinema is full.");
        } else {
            System.out.printf("There are %d seats left in the cinema.\n", hallCapacity);
        }
        System.out.printf("Cinema income - %d lv.", income);
    }
}
