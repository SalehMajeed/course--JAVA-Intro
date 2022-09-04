import java.util.Scanner;

public class pattern18 {
    public static void main(String... args) {
        int number = (new Scanner(System.in)).nextInt();
        int stars = number;
        int spaces = 0;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= stars; j++) {
                if(i > 1 && i <= number /2 && j > 1 && j < stars) {
                    System.out.print("\t");
                }
                else {
                    System.out.print("*\t");
                }
            }
            if (i <= number / 2) {
                spaces += 1;
                stars -= 2;
            } else {
                spaces -= 1;
                stars += 2;
            }
            System.out.println();
        }
    }
}
