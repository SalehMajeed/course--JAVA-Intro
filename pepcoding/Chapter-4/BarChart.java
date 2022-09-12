import java.util.Scanner;

public class BarChart {
    public static void main(String... args) {
        int number = (new Scanner(System.in)).nextInt();
        int[] inputArray = new int[number];

        for (int i = 0; i < number; i++) {
            inputArray[i] = (new Scanner(System.in)).nextInt();
        }

        int max = inputArray[0];
        for (int i = 0; i < number; i++) {
            if (inputArray[i] > max) {
                max = inputArray[i];
            }
        }

        for (int floor = max; floor >= 1; floor--) {
            for (int i = 0; i < number; i++) {
                if (inputArray[i] >= floor) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
