import java.util.Scanner;

public class Benjamin {
    public static void main(String ...args) {
        int number = (new Scanner(System.in)).nextInt();
        for(int i = 1; i * i <= number; i++) {
            System.out.println(i * i);
        }
    }
}
