import java.util.Scanner;

public class FloatFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num;
        double fact =1.0;

        System.out.print("Enter a number: ");
        num= scanner.nextLong();
        
        for (long i = 1; i <= num; ++i) {
            fact *= i;
        }

        System.out.println("Factorial of " +num+ " is: " + fact);

        scanner.close();
    }
}
