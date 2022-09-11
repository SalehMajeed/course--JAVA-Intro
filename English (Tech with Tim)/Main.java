public class Main {
    public static void main(String... args) {
        System.out.println("Hello");
        // dataTypes();
        // operation();
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
}
