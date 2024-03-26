import java.util.Scanner;

public class InRangeAdder  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          
          int low,high, num;
        int sumInRange = 0;
        int sumOutOfRange = 0;
        System.out.println("In-range Adder");

        System.out.print("Low end of range: ");        low = scanner.nextInt();
        
        System.out.print("High end of range: ");
        high = scanner.nextInt();


        while (true) {
            
        System.out.println("Enter data:");
            num = scanner.nextInt();
            if (num == 0) 
                break;
            

            if (num >= low && num <= high) 
                sumInRange += num;
            else 
                sumOutOfRange += num;
            
        }

        System.out.println("Sum of in-range values: " + sumInRange);
        System.out.println("Sum of out-of-range values: " + sumOutOfRange);

        scanner.close();
    }
}
