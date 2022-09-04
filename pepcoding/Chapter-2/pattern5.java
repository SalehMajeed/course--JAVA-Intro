import java.util.Scanner;

public class pattern5 {
    public static void main(String ...args) {
        int number = (new Scanner(System.in)).nextInt();
        int spaces = number / 2;
        int stars = 1;
        for(int i = 1; i <= number; i++) {
            for(int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }
            for(int k = 1; k <= stars; k++ ) {
                System.out.print("*\t");
            }
            System.out.println();
            if(i <= number/2) {
                spaces -= 1;
                stars += 2;
            } else {
                stars -= 2;
                spaces += 1;
            }
        }
    }
}
