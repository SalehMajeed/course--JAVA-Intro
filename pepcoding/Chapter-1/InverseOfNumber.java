import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String ...args) {
        int number = (new Scanner(System.in)).nextInt();

        int invNumber = 0; 
        int position = 1;
        while(number != 0) {
            int lastNumber = number%10;

            invNumber = invNumber + position * (int)Math.pow(10, lastNumber - 1);

            number = number / 10;
            position++;
        }
        System.out.println("Inverse number is: " + invNumber);
    }
}