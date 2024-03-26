import java.util.Scanner;

public class ModifiedMillionDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double interestRate,initialInvestment,annualContribution;
        double balance;
        int year = 0;
        
        System.out.println("Enter the interest rate (as a decimal):");
         interestRate = scanner.nextDouble();

        System.out.println("Enter the initial investment:");
         initialInvestment = scanner.nextDouble();

        System.out.println("Enter the annual contribution:");
         annualContribution = scanner.nextDouble(); 
         
        balance = initialInvestment;
        
        while (balance < 1000000) {
            balance += annualContribution;
            balance *= (1 + interestRate);
            year++;
            
            System.out.println("Year"+year+": $"+balance);
        }

        System.out.println("It took " + year + " years to reach $1,000,000.");
        scanner.close();
    }
}
