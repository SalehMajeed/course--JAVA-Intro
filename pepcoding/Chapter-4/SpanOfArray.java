import java.util.Scanner;

public class SpanOfArray {
    public static void main(String... args) {
        int number = (new Scanner(System.in)).nextInt();
        int[] inputArray = new int[number];
        for (int i = 0; i < number; i++) {
            inputArray[i] = (new Scanner(System.in)).nextInt();
        }
        int min = inputArray[0];
        int max = inputArray[0];

        for (int i = 0; i < number; i++) {
            if (inputArray[i] > max) {
                max = inputArray[i];
            }

            if (inputArray[i] < min) {
                min = inputArray[i];
            }
        }
        System.out.println(max - min);

    }
}