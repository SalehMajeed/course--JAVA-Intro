import java.util.Scanner;

public class pattern2 {
    public static void main(String... arg) {
        int number = (new Scanner(System.in)).nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = number; j > i; j--) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}