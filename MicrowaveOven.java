import java.util.Scanner;

public class MicrowaveOven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int item, timeHeat, minute, second;
        int heat=0;
        
        System.out.print("How many item to heat: ");
        item = scan.nextInt();
        System.out.print("Time for one item: ");
        timeHeat = scan.nextInt();

        if (item ==1) {
            minute = timeHeat / 100;
            second = (timeHeat % 100) ;
            System.out.print("Heat for "+ minute+" minutes "+ second+" seconds");
        }
        if (item ==2) {
             heat =timeHeat + timeHeat*50/100 ;
            minute = heat/100;
            second = heat%100;
            
          System.out.print("Heat for "+ minute+" minutes "+ second+" seconds");
        }
        if (item ==3) {
            timeHeat *= 2;
            minute = timeHeat / 100;
            second = (timeHeat% 100) ;
            System.out.print("Heat for "+ minute +" minutes "+ second+ " seconds");
        }
        if (item >= 4) 
           
       
        System.out.print("Heating morr than three items at once is not recommended");

        // Close the Scanner
        scan.close();
    }
}
