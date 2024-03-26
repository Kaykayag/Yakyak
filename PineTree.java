public class PineTree {
    public static void main(String[] args) {
        int height = 7;

        for (int i = 1; i <= height; i++) {
          
            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < height - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("***");
        }
    }
}
