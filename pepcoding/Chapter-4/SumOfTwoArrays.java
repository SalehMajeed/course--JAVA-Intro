import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String... args) {
        int firstArrrayLength = (new Scanner(System.in)).nextInt();
        int[] firstArray = new int[firstArrrayLength];
        for (int i = 0; i < firstArrrayLength; i++) {
            firstArray[i] = (new Scanner(System.in)).nextInt();
        }

        int SecondArrrayLength = (new Scanner(System.in)).nextInt();
        int[] secondArray = new int[SecondArrrayLength];
        for (int i = 0; i < SecondArrrayLength; i++) {
            secondArray[i] = (new Scanner(System.in)).nextInt();
        }

        int sumLength = firstArrrayLength > SecondArrrayLength ? firstArrrayLength : SecondArrrayLength;
        int[] sumArray = new int[sumLength];

        int carry = 0;
        for (int i = 0; i < sumLength; i++) {
            int sum = carry;
            if (i < firstArrrayLength) {
                sum += firstArray[i];
            }
            if (i < SecondArrrayLength) {
                sum += secondArray[i];
            }
            carry = sum / 10;
            sumArray[i] = sum % 10;
        }

        if (carry != 0) {
            System.out.print(carry);
        }
        for (int val : sumArray) {
            System.out.print(val);
        }
    }
}
