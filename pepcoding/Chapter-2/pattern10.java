import java.util.Scanner;

public class pattern10 {
    public static void main(String... args) {
        int number = (new Scanner(System.in)).nextInt();
        int outerSpaces = number / 2;
        int innerSpaces = -1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= outerSpaces; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");

            for (int k = 1; k <= innerSpaces; k++) {
                System.out.print("\t");
            }

            if (i > 1 && i < number) {
                System.out.print("*\t");
            }

            if (i <= number / 2) {
                outerSpaces -= 1;
                innerSpaces += 2;
            } else {
                outerSpaces += 1;
                innerSpaces -= 2;
            }
            System.out.println();
        }
    }
}
