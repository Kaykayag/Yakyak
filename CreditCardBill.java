import java.util.Scanner;
import java.text.DecimalFormat;

public class CreditCardBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format= new DecimalFormat("0.00000");
        
        double balance,monthlyInterestRate,monthlyPayment,interest;
        double totalPayments = 0.0;
        int month = 0;

        System.out.println("Enter the beginning balance:");
         balance = scanner.nextDouble();

        System.out.println("Enter the monthly interest rate :");
         monthlyInterestRate = scanner.nextDouble();

        System.out.println("Enter the monthly payment:");
         monthlyPayment = scanner.nextDouble();

        
        while (balance > 0) {
            month++;
             interest = balance * monthlyInterestRate;
            balance += interest;
            balance -= monthlyPayment;

            if (balance < 0) {
                totalPayments += monthlyPayment + balance;
                balance = 0;
            } else 
                totalPayments += monthlyPayment;
            

            System.out.println("Month: " + month + "   balance: " +format.format(balance) + "   total payments: " + format.format(totalPayments));
        }

        scanner.close();
    }
}
