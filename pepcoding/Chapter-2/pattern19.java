import java.util.Scanner;

public class pattern19 {
    public static void main(String... args) {
        int number = (new Scanner(System.in)).nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                Boolean leftICondition = i == 1 && j <= number / 2 + 1;
                Boolean rightICondition = i == number && j >= number / 2 + 1;
                Boolean leftJcondition = j == 1 && i > number / 2 + 1;
                Boolean rightJCondition = j == number && i <= number / 2;
                if ((leftICondition || (j == number / 2 + 1) || rightICondition)
                        || (leftJcondition || (i == number / 2 + 1) || rightJCondition)) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
