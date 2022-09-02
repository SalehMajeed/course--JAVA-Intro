import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String ...args) {
        int number = (new Scanner(System.in)).nextInt();

        int inv = 0; 
        int op = 1;
        while(number != 0) {
            int od = number%10;
            int id = op;
            int ip = od;

            inv = inv + id * (int)Math.pow(10, ip - 1);

            number = number / 10;
            op++;
        }
        System.out.println(inv);
    }
}