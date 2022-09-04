import java.util.Scanner;

public class pattern14 {
    public static void main(String... args) {
        int number = (new Scanner(System.in)).nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}
