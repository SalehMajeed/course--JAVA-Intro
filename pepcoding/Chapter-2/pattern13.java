import java.util.Scanner;

public class pattern13 {
    public static void main(String... args) {
        int number = (new Scanner(System.in)).nextInt();

        for (int i = 0; i <= number; i++) {
            int icj = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(icj + "\t");
                int icjp1 = icj * (i - j) / (j + 1);
                icj = icjp1;
            }
            System.out.println();
        }
    }
}
