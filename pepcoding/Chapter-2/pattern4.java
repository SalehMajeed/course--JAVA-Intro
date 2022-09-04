import java.util.Scanner;
public class pattern4 {
    public static void main(String ...args) {
        int number = (new Scanner(System.in)).nextInt();
        int numberOfStars = number;
        int numberOfSpaces = 0;
        for(int i = 0; i < number; i++) {
            for(int j = 0; j < numberOfSpaces; j++) {
                System.out.print("\t");
            }
            for(int k = numberOfStars; k > 0; k--){
                System.out.print("*\t");
            }
            System.out.println();
            numberOfStars -= 1;
            numberOfSpaces +=1;
        }
    }
}
