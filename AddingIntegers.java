import java.util.Scanner;

public class AddingIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb;
        int sum=0;

        System.out.print("Enter first integer (enter 0 to quit): ");
        numb = scanner.nextInt();

        if (numb == 0) 
            System.out.println("No integers were entered.");
        else 
            sum = numb;

            while (numb!= 0) {
                System.out.print("Enter an integer (or 0 to quit): ");
                numb = scanner.nextInt();
                
                sum += numb;
            }

            System.out.println("Sum of the integers: " + sum);
        

        System.out.println("bye!!");

        scanner.close();
    }
}
