import java.util.Scanner;

class AllPrimeNumberTillN {
    public static void main(String... ars){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Number Number");
        int firstNumber = sc.nextInt();
        int lastNumber = sc.nextInt();
        for(int i = firstNumber; i <= lastNumber; i++){
            isPrime(i);
        }

    }

    static void isPrime(int num) {
        boolean flag = false;
        for(int i = 2; i*i <= num; i++){
            if ( num % i == 0 && num != i) {
                flag = true;
                break;
            }
        }

        if(flag != true) {
            System.out.println(num);
        }
    }
}