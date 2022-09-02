import java.util.Scanner;

public class NumberRotation {
    public static void main(String... args) {
        int number = (new Scanner(System.in)).nextInt();
        int numberOfRotation = (new Scanner(System.in)).nextInt();

        int tempNumber = number;
        int totalDigits = 0;

        while (tempNumber > 0) {
            tempNumber = tempNumber / 10;
            totalDigits++;
        }

        numberOfRotation = numberOfRotation % totalDigits;

        if (numberOfRotation < 0) {
            numberOfRotation = numberOfRotation + totalDigits;
        }

        int divisor = 1;
        int multiplier = 1;
        for(int i = 1; i <= totalDigits; i++) {
            if(i <= numberOfRotation) {
                divisor = divisor * 10;
            } else {
                multiplier = multiplier * 10;
            }
        }

        int rotateNumbers = number / divisor;
        int remainder = number % divisor;

        int rotatedNumber = remainder * multiplier + rotateNumbers;
        System.out.println(rotatedNumber); 
    }
}
