import java.util.Scanner;

public class PrimeNumber {
    public static void main(String... args) {
        System.out.println("Enter Total Inputs: ");
        Scanner scn = new Scanner(System.in);
        int totalInputs = Integer.parseInt(scn.nextLine());
        System.out.println("Total Inputs are: " + totalInputs);
        // slowMethod(totalInputs);
        // fastMethod(totalInputs);
    }

    static void slowMethod(int totalInputs) {
        for (int i = 0; i < totalInputs; i++) {
            int number = Integer.parseInt((new Scanner(System.in)).nextLine());
            int count = 0;
            for (int div = 1; div <= number; div++) {
                if (number % div == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                System.out.println(number + " is Prime.");
            } else {
                System.out.println(number + " is Not Prime.");
            }
        }
    }

    static void fastMethod(int totalInputs) {
        for (int i = 0; i < totalInputs; i++) {
            int number = Integer.parseInt((new Scanner(System.in)).nextLine());
            int count = 0;
            for (int div = 2; div * div <= number; div++) {
                if (number % div == 0) {
                    count += 1;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(number + " is Prime.");
            } else {
                System.out.println(number + " is Not Prime.");
            }
        }
    }
}
