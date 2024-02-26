import java.util.Scanner;

public class SetA
 {
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value between 0 and 35: ");
        int value = scanner.nextInt();

        if (value <= 9) 
            System.out.println("Output: " + value);
        else {
            char output = (char) ('A' + (value - 10));
            System.out.println("Output: " + output);
        }

      
    }
}
