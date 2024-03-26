import java.util.Scanner;

public class SumOfOddIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num,no2;
        int sumOfOdds = 0;
        
        System.out.print("Enter an integer N: ");
        num= scanner.nextInt();
        
         no2 = num * num;
        
        for (int i = 1; i <=num; i += 2) {
            sumOfOdds += i;
        }
        
        System.out.println("Sum of odd integers from 1 to N: " + sumOfOdds);
        System.out.println("N^2: " + no2);
        
        scanner.close();
    }
}
