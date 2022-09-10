import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main (String ...args) {
        int number = (new Scanner(System.in)).nextInt();
        int baseNumber = (new Scanner(System.in)).nextInt();
        int targetBase = (new Scanner(System.in)).nextInt();
        int result = anyBaseToAnyBase(number, baseNumber, targetBase);
        System.out.println(result);
    }
    public static int anyBaseToAnyBase(int number, int baseNumber, int targetBase) {
        int convertedToDecimal = anyBaseToDecimal(number, baseNumber);
        int convertedToTargetBase = decimalToAnyBase(convertedToDecimal, targetBase);
        return convertedToTargetBase;
    }

    public static int anyBaseToDecimal(int number, int baseNumber) {
        int result = 0;
        int incrementPower = 1;
        while(number > 0) {
            result += (number % 10) * incrementPower; 
            number /= 10;
            incrementPower = incrementPower * baseNumber;
        }
        return result;
    }

    public static int decimalToAnyBase(int number, int baseNumber) {
        int incrementPower = 1;
        int result = 0;
        while(number > 0) {
            result += (number % baseNumber) *  incrementPower;
            number /= baseNumber;
            incrementPower *= 10;

        }
        return result;
    }
}
