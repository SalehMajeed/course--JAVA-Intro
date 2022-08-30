import java.util.Scanner;

public class Loops {
    public static void main(String... args) {
        int inputNumber = (new Scanner(System.in)).nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(inputNumber + " * " + (i) + " = " + inputNumber * (i));
        }
        while (inputNumber > 0) {
            System.out.println(inputNumber);
            inputNumber -= 1;
        }
        do {
            System.out.println("Now See the magic ");
            System.out.println(inputNumber);
            inputNumber += 1;
        } while (inputNumber < 10);
    }
}
