import java.util.Scanner;

public class setALoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueAdd;
        int value;
        char output;
        
        do {
       
        System.out.print("Enter a value between 0 and 35: ");
        value = scanner.nextInt();
        
        if (value <= 9) 
            System.out.println("Output: " + value);
        else {
            output = (char) ('A' + (value - 10));
            System.out.println("Output: " + output);
        }

            System.out.print("Do you want to continue ? (true or false): ");
            continueAdd= scanner.nextBoolean();

            if (!continueAdd) {
                System.out.println("Goodbye!");
            }
            
        } while (continueAdd);

        scanner.close();
    }
}
