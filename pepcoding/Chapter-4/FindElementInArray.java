import java.util.Scanner;

public class FindElementInArray {
    public static void main(String... args) {
        int number = (new Scanner(System.in)).nextInt();
        int[] inputArray = new int[number];
        int ans = -1;
        for (int i = 0; i < number; i++) {
            inputArray[i] = (new Scanner(System.in)).nextInt();
        }
        int targetNumber = (new Scanner(System.in)).nextInt();

        for (int i = 0; i < number; i++) {
            if (inputArray[i] == targetNumber) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
