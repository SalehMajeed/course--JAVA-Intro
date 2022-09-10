import java.util.Scanner;

public class AnyBaseMultiplication {
    public static void main(String... args) {
        int number1 = (new Scanner(System.in)).nextInt();
        int number2 = (new Scanner(System.in)).nextInt();
        int baseNumber = (new Scanner(System.in)).nextInt();
        int result = anyBaseMultiplication(number1, number2, baseNumber);
        System.out.println(result);
    }

    public static int anyBaseMultiplication(int number1, int number2, int baseNumber) {
        int result = 0;
        int incrementPower = 1;
        while (number2 > 0) {
            int modulus2 = number2 % 10;
            int singleMultiplication2 = anyBaseSingleMultiplication(number1, modulus2, baseNumber);
            result = anyBaseAddition(result, singleMultiplication2 * incrementPower, baseNumber);
            incrementPower *= 10;
            number2 /= 10;
        }
        return result;
    }

    public static int anyBaseSingleMultiplication(int number1, int number2, int baseNumber) {
        int carry = 0;
        int result = 0;
        int incrementPower = 1;
        while (number1 > 0 || carry > 0) {
            int firstModule = number1 % 10;
            int multiplier = (firstModule * number2) + carry;
            carry = multiplier / baseNumber;
            result += (multiplier % baseNumber) * incrementPower;

            incrementPower *= 10;
            number1 /= 10;
        }
        return result;
    }

    public static int anyBaseAddition(int number1, int number2, int baseNumber) {
        int result = 0;
        int incrementPower = 1;
        int carry = 0;
        while(number1 > 0 || number2 > 0 || carry > 0) {
            int firstNumberRemainder = number1 % 10;
            int secondNumberRemainder = number2 % 10;
            int total = firstNumberRemainder + secondNumberRemainder + carry;
            
            carry = total / baseNumber;
            result += (total % baseNumber) * incrementPower;
            
            incrementPower *= 10;
            number1 /= 10;
            number2 /= 10;
        }
        return result;
    }
}
