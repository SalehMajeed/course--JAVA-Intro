import java.util.Scanner;

public class DigitFrequency {
    public static void main(String... args) {
        int number = (new Scanner(System.in)).nextInt();
        int inputNumber = (new Scanner(System.in)).nextInt();
        int result = getDigitFrequency(number, inputNumber);
        System.out.println(result);
    }

    public static int getDigitFrequency(int number, int inputNumber) {

        int repetition = 0;

        while (number > 0) {
            if (number % 10 == inputNumber) {
                repetition += 1;
            }
            number /= 10;
        }
        return repetition;
    }
}
