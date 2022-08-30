import java.util.Scanner;

class PrimeNumber {
    public static void main(String... ars){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Number Number");
        int totalNum = sc.nextInt();
        for(int i = 0; i < totalNum; i++){
            System.out.print("Enter Number: ");
            int eachNumber = sc.nextInt();
            isPrime(eachNumber);
        }

    }

    static void isPrime(int num) {
        boolean flag = false;
        for(int i = 2; i*i <= num; i++){
            if ( num % i == 0 && i != num) {
                flag = true;
                break;
            }
        }

        if(flag == true) {
            System.out.println("Number is not Prime");
        } else {
            System.out.println("Number is Prime");
        }
    }
}