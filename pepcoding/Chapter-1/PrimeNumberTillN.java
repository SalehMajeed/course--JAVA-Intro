import java.util.Scanner;

public class PrimeNumberTillN {
    public static void main(String... args) {
        System.out.println("Enter Starting Number: ");
        int startNumber = (new Scanner(System.in)).nextInt();
        System.out.println("Enter Ending Number: ");
        int EndNumber = (new Scanner(System.in)).nextInt();
        for (int i = startNumber; i <= EndNumber; i++) {
            int count = checkNumber(i);
            if(count == 0) {
                System.out.println(i);
            }
        }
    }

    private static int checkNumber(int i) {
        int count = 0;
        for(int div = 2; div * div <= i; div++) {
            if(i % div == 0) {
                count += 1;
                break;
            }
        }
        return count;
    } 
}