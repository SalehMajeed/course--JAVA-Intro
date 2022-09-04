import java.util.Scanner;

public class pattern9 {
    public static void main(String... args) {
        int number = (new Scanner(System.in)).nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j < i; j++) {
                if(i == j) {
                    System.out.print("*");
                } else {
                    System.out.print("\t")
                }
            }
            System.out.println((""));
        }
    }
}
