import java.util.Scanner;

public class AnyBaseSubtraction {
    public static void main(String... args) {
        int number1 = (new Scanner(System.in)).nextInt();
        int number2 = (new Scanner(System.in)).nextInt();
        int baseNumber = (new Scanner(System.in)).nextInt();
        int result = anyBaseSubtraction(number1, number2, baseNumber);
        System.out.println(result);
    }

    public static int anyBaseSubtraction(int number1, int number2, int baseNumber) {
        int result = 0;
        int carry = 0;
        int incrementPower = 1;
        while (number1 > 0) {
            int firstNumber = number1 % 10;
            int secondNumber = number2 % 10;

            int total = 0;
            firstNumber += carry;
            carry = 0;

            total = firstNumber - secondNumber;
            if (secondNumber > firstNumber) {
                carry = -1;
                total += baseNumber;
            }

            result += total * incrementPower;

            incrementPower *= 10;
            number1 /= 10;
            number2 /= 10;
        }
        return result;
    }
}
