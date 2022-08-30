import java.util.Scanner;

class UserInput{
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println("You entered: " + num);

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println("Your Name is : " + name);
        sc.close();
    }
}