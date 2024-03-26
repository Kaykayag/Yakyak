import java.util.Scanner;

public class BirthdayParadox {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        double probability = 1.0;
        int numGuests = 0;
        
        System.out.print("Enter the number of guests: ");
         num= scanner.nextInt();
        scanner.close();

        
        for (int i = 0; i < num; i++) {
            probability *= (365.0 - i) / 365.0;
            numGuests++;
            if (probability <= 0.50) {
                break;
            }
        }

        System.out.println("Number of guests needed for a probability greater than 50%: " + numGuests);
    }
}
