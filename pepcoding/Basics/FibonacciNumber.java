import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String... args) {
        System.out.print("Enter N'th Number: ");
        int number = (new Scanner(System.in)).nextInt();
        // System.out.println(fibonacci(number));
        int a = 0; 
        int b = 1;
        for(int i = 0; i < number; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }

    private static int fibonacci(int number) {
        if (number == 0) {
            return 0;
        }
        if(number == 1 || number == 2) {
            return number;
        }
        return  fibonacci(number - 2) + fibonacci(number - 1);
    }
}
