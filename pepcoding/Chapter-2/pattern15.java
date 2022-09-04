import java.util.Scanner;

public class pattern15 {
    public static void main(String... args) {
        int number = (new Scanner(System.in)).nextInt();
        int spaces = number / 2;
        int stars = 1;
        int val = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }

            int cval = val;

            for (int k = 1; k <= stars; k++) {
                System.out.print(cval + "\t");
                if ( k <= stars / 2) {
                    cval += 1;
                } else {
                    cval -= 1;
                }
            }
            if (i <= number / 2) {
                spaces -= 1;
                stars += 2;
                val += 1;
            } else {
                spaces += 1;
                stars -= 2;
                val -= 1;
            }
            System.out.println();
        }
    }
}
