import java.util.Scanner;

public class pattern20 {
    public static void main(String... args) {
        int number = (new Scanner(System.in)).nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (j == 1 || j == number) {
                    System.out.print("*\t");
                } else if (i > number / 2 && (i == j || i + j == number + 1)) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}