import java.util.Scanner;

public class pattern12 {
    public static void main(String... args) {
        int number = (new Scanner(System.in)).nextInt();
        int a = 0;
        int b = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a+"\t");
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
}
