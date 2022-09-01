import java.util.Scanner;

public class ReverNumber {
    public static void main(String... args) {
        int number = (new Scanner(System.in)).nextInt();
        while (number > 0) {
            System.out.println(number % 10);
            number = (int) number / 10;
        }
    }
}
