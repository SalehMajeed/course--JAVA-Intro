import java.util.Scanner;

public class pattern8 {
    public static void main(String ...args) {
        int number = (new Scanner(System.in)).nextInt();
        for(int i = 0; i < number; i++) {
            for(int j = number; j > i + 1; j--) {
                System.out.print("\t");
            }
            System.out.println("*");
        }
    }
}