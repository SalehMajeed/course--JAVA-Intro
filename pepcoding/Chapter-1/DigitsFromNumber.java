import java.util.Scanner;

public class DigitsFromNumber {
    public static void main(String ...args) {
        int actualNumber = (new Scanner(System.in)).nextInt();
        int number = actualNumber;
        int count = 0;
        while(number > 0) {
            number = (int)(number / 10);
            count += 1;
        }
        int div = (int)Math.pow(10, count - 1);

        while(div != 0) {
            int newNumber = actualNumber / div;
            System.out.println(newNumber);
            actualNumber = actualNumber % div;
            div = div / 10;
        }
    }
}
