import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class DecimalToAnyBase {
    public static void main(String ...args){
        int number = (new Scanner(System.in)).nextInt();
        int baseNumber = (new Scanner(System.in)).nextInt();
        int result = decimalToAnyBase(number, baseNumber);
        System.out.println(result);
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
