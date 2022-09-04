import java.util.Scanner;

public class pattern11 {
    public static void main(String... args) {
        int number = (new Scanner(System.in)).nextInt();
        int a = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + "\t");
                a += 1;
            }
            System.out.println();
        }
    }
}
