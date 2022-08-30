public class ZStar{
    public static void main(String[] args) {
        // advance(5);
        System.out.println("****\n   *\n  *\n *\n****");
    }

    public static void advance(int length){
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                if ((i == 0) || (i == length - 1) || (i + j == length) ){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}