import java.util.Scanner;

public class PowerOfANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1;
        double result= 0;;
        int num2;
        
        System.out.println("Enter X:");
        num1= scanner.nextDouble();
        
        System.out.println("Enter N:");
        num2= scanner.nextInt();

       
        if (num2 <= 0) 
            System.out.println("N must be a positive integer.");
            
        else 
           result = 1.0;
            for (int i =1; i <= num2; i++){ 
                result *= num1;
            

            System.out.println(num1+ " raised to the power " + num2 + " is: " + result);
            }

      scanner.close();
    }
}
