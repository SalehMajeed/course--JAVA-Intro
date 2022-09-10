import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String... args) {
     int number1 = (new Scanner(System.in)).nextInt();
     int number2 = (new Scanner(System.in)).nextInt();
     int baseNumber = (new Scanner(System.in)).nextInt();
     int result = anyBaseAddition(number1, number2, baseNumber);
     System.out.println(result);
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
