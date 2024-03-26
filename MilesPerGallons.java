import java.util.Scanner;

public class MilesPerGallon{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
         
        int initialMiles = 0;
        int finalMiles,gallons;
        double mpg;
        
        System.out.println("Miles Per Gallon Program");

        while (initialMiles >= 0) {
            System.out.print("Initial miles: ");
            initialMiles = scanner.nextInt();

          
            if (initialMiles < 0) {
                System.out.println("bye for now");
               break;;
            }

            System.out.print("Final miles: ");
            finalMiles = scanner.nextInt();

            System.out.print("Gallons: ");
            gallons = scanner.nextInt();

           
           mpg = (finalMiles - initialMiles) /gallons;
            System.out.println("Miles per Gallon: " + mpg);
        }

        scanner.close();
    }
}
