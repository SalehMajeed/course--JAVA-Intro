import java.util.Scanner;

public class PrimeFactor {
    public static void main(String... args) {
        int number = (new Scanner(System.in)).nextInt();

        for (int div = 2; div * div <= number; div++) {
            while (number % div == 0) {
                number = number / div;
                System.out.println(div);
            }
        }
        if(number != 1) {
            System.out.println(number);
        }
    }
}