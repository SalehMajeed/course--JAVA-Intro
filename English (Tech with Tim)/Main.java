import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        System.out.println("Hello");
        // dataTypes();
        // operation();
        // userInputs();
        // conditional();
        arrays();
    }

    public static void dataTypes() {
        // Primitive Data Types
        int number = 1_1;
        System.out.println("Number type: " + number);

        byte byteNumber = 1;
        System.out.println("byte type: " + byteNumber);

        short shortNumber = 1;
        System.out.println("short type: " + shortNumber);

        long longNumber = 1l;
        System.out.println("long type: " + longNumber);

        double doubleNumber = 4123.212d;
        System.out.println("Double type: " + doubleNumber);

        float floatNumber = 4123.789f;
        System.out.println("Float type: " + floatNumber);

        boolean booleanValue = true;
        System.out.println("Boolean type: " + booleanValue);

        char character = 'c';
        System.out.println("Character type: " + character);

        // Non-Primitive Data Types

        String stringValue = "Hello";
        System.out.println("String type: " + stringValue);

    }

    public static void operation() {
        int number1 = 10;
        int number2 = 20;
        int sum = number1 + number2;
        int subtract = number1 - number2;
        int multiply = number1 * number2;
        int division = number1 / number2;
        int modulus = number1 % number2;
        System.out.println(sum);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(division);
        System.out.println(modulus);
    }

    public static void userInputs() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String stringValue = sc.nextLine();
        System.out.println("Your String is : " + stringValue);

        System.out.println("Enter String: ");
        int intNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Your Number is : " + intNumber);

    }

    public static void conditional() {
        int x = 2;
        int y = 32;
        int z = 34;

        String str1 = "H";
        String str2 = "h";

        boolean compare = (x + y) == z;
        if (compare == true) {
            System.out.println("Bingo right: " + x + " + " + y + " is Always = " + z);
        } else {
            System.out.println("Not  : " + x + " + " + y + " is Always Not Iqual " + z);
        }

        if (str1 == str2) {
            System.out.println("Right");
        } else {
            System.out.println("Nope");
        }

        if (true && false || (!false || true)) {
            System.out.println("Right");
        } else {
            System.out.println("Nope");
        }

    }

    public static void arrays() {
        int[] numberArr = new int[5];
        String[] stringArray = new String[5];
        double[] doubleArray = { 1.3, 1.4, 1.5, 1.3, 1.4 };

        for (int i = 0; i < numberArr.length; i++) {
            numberArr[i] = i + 1;
            stringArray[i] = "str" + (i + 1);
        }

        for (int i = 0; i < numberArr.length; i++) {
            if(i == 3) {
                continue;
            } else if(i == 5) {
                break;
            }
            System.out.println(numberArr[i]);
            System.out.println(stringArray[i]);
        }

        for (double d : doubleArray) {
            System.out.println(d);
        }

    }
}
