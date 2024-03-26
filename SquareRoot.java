import java.util.Scanner;

public class  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        double squareRoot;
        
        do {
           double  number;
            do {
                System.out.print("Enter a number --> ");
                while (!scanner.hasNextDouble()) {
                    System.out.print("Invalid input. Please enter a number --> ");
                    scanner.next();
                }
                number = scanner.nextDouble();
                if (number <= 0) {
                    System.out.println(">>> Number must be positive <<<");
                }
            } while (number <= 0);

             squareRoot = Math.sqrt(number);
            System.out.println("Square root of " + number + " is " + squareRoot);

            do {
                System.out.print("Do you wish to continue (yes or no)? ");
                input = scanner.next().toLowerCase();
                if (!input.equals("yes") && !input.equals("no")) {
                    System.out.println(">>> Please respond with (yes or no) <<<");
                }
            } while (!input.equals("yes") && !input.equals("no"));

        } while (!input.equals("no"));

        System.out.println("Bye");
        scanner.close();
    }
}
