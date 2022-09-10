import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String... args) {
        int number = (new Scanner(System.in)).nextInt();
        int baseNumber = (new Scanner(System.in)).nextInt();
        int result = anyBaseToDecimal(number, baseNumber);
        System.out.println(result);
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
}
