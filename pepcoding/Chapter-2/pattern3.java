import java.util.Scanner;

public class pattern3 {
    public static void main(String... args) {
        int number = (new Scanner(System.in)).nextInt();
        int numberOfSpace = number - 1;
        int numberOfStar = 1;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < numberOfSpace; j++) {
                System.out.print(" \t");
            }
            for (int k = 0; k < numberOfStar; k++) {
                System.out.print("* \t");
            }
            numberOfSpace -= 1;
            numberOfStar += 1;
            System.out.println();
        }
    }
}
