import java.util.Scanner;

public class DigitsInNumber {
    public static void main(String ...args) {
        int number = (new Scanner(System.in)).nextInt();
        int count = 0;
        while(number > 0) {
            count += 1;
            number = (int)(number/10);
        }
        System.out.println(count);
    }
}
