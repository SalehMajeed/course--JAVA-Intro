import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        System.out.print("Enter Any Number: ");
        int x = (new Scanner(System.in)).nextInt();
        if (x % 2 == 2) {
            System.out.println(x + " is even.");
        } else {
            System.out.println(x + " is odd.");
        }

        System.out.println("Done");
    }
}