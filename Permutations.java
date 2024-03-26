import java.util.Scanner;

public class  Permutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int letN,letR;
        long permutations;
        long result = 1;

        System.out.print("Enter the value of N: ");
        letN = scanner.nextInt();

        System.out.print("Enter the value of R: ");
        letR = scanner.nextInt();

        if (letN< 0 || letR< 0 || letR > letN) {
            System.out.println("Invalid input. Both N and R must be non-negative, and R must be less than or equal to N.");
       

        for (int i = letN; i > letN - letR; i--) 
            result *= i;
        }
        permutations= result;

         
            System.out.println("Number of permutations of " + letN + " objects taken " + letR + " at a time: " + permutations);
       

        scanner.close();

}
}