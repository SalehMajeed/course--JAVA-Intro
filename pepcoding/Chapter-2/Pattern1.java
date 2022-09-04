import java.util.Scanner;
public class Pattern1 {
    public static void main(String ...args) {
        int number = (new Scanner(System.in)).nextInt();
        for(int i = 0; i < number; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}