import java.util.Scanner;

class ConditionalStatement{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println(x + " is Even");
        } else {
            System.out.println(x + " is odd");
        }
        System.out.println("Done");
    }
}