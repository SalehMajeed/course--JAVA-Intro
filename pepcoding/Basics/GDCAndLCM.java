import java.util.Scanner;

public class GDCAndLCM {
    public static void main(String ...args) {
        int number1 = (new Scanner(System.in)).nextInt();
        int number2 = (new Scanner(System.in)).nextInt();

        int tempNumber1 = number1;
        int tempNumber2 = number2;
        while(tempNumber1 % tempNumber2 != 0) {
            int remainder = tempNumber1 % tempNumber2;
            tempNumber1 = tempNumber2;
            tempNumber2 = remainder;
        }

        int gcd = tempNumber2;
        int lcm = (number1 * number2) / gcd;

        System.out.println("GCD is: " + gcd + " AND LCM is : " + lcm);
    }
}
