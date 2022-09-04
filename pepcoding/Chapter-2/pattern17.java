import java.util.Scanner;

public class pattern17 {
    public static void main(String... args) {
        int number = (new Scanner(System.in)).nextInt();
        int stars = 1;
        int spaces = number / 2;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= spaces; j++) {
                if (i == number / 2 + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*\t");
            }

            if (i <= number / 2) {
                stars += 1;
            } else {
                stars -= 1;
            }

            System.out.println();
        }
    }
}
