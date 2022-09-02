import java.util.Scanner;

public class Pythagorean {
    public static void main(String... args) {
        int a = (new Scanner(System.in)).nextInt();
        int b = (new Scanner(System.in)).nextInt();
        int c = (new Scanner(System.in)).nextInt();

        int max = a;
        if (b >= max) {
            max = b;
        }

        if (c >= max) {
            max = c;
        }

        if (max == a) {
            boolean flag = ((b * b + c * c) == (a * a));
            System.out.println(flag);
        } else if (max == b) {
            boolean flag = ((a * a + c * c) == (b * b));
            System.out.println(flag);
        } else {
            boolean flag = ((a * a + b * b) == (c * c));
            System.out.println(flag);
        }
    }
}
