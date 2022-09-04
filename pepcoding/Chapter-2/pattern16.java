import java.util.Scanner;

public class pattern16 {
    public static void main(String... args) {
        int number = (new Scanner(System.in)).nextInt();
        int spaces = 2 * number - 3;
        int stars = 1;
        for (int i = 1; i <= number; i++) {
            int val = 1;
            for (int k = 1; k <= stars; k++) {
                System.out.print(val + "\t");
                val += 1;
            }
            for (int k = 1; k <= spaces; k++) {
                System.out.print("\t");
            }
            if (i == number) {
                stars -= 1;
                val -= 1;
            }
            for (int k = 1; k <= stars; k++) {
                val -= 1;
                System.out.print(val + "\t");
            }
            stars += 1;
            spaces -= 2;
            System.out.println();
        }
    }
}
