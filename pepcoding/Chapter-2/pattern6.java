import java.util.Scanner;

public class pattern6 {
    public static void main(String... args) {
        int number = (new Scanner(System.in)).nextInt();
        int stars = number / 2 + 1;
        int spaces = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= stars; j++) {
                System.out.print("*\t");
            }
            for (int k = 1; k <= spaces; k++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            if (i <= number / 2) {
                stars -= 1;
                spaces += 2;
            } else {
                stars += 1;
                spaces -= 2;
            }
        }
    }
}
