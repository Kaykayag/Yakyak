import java.util.Scanner;

public class WallpaperCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width,height,length,areaWalls, openingWidth,openingHeight;
        double areaToCover;
       final double rollWidthInches = 27;
       final double rollLengthYards = 4.5;
        double areaPerRoll ;
        int numOpening,rollsNeeded;
        double totalAreaOpenings =0;
        
        System.out.println("Enter the dimensions of the room (in feet):");
        
        System.out.print("Width: ");
        width = scanner.nextDouble();
        
        System.out.print("Height: ");
        height = scanner.nextDouble();
        
        System.out.print("Length: ");
        length = scanner.nextDouble();
        
        System.out.print("Enter the number of openings: ");
        numOpening = scanner.nextInt();

       
        areaWalls = 2 * (length * height + width * height);

        for (int i = 1; i <= numOpening; i++) {
            System.out.println("Enter the dimensions of opening " + i + " (in feet):");
            
            System.out.print("Width: ");
            openingWidth = scanner.nextDouble();
            
            System.out.print("Height: ");
            openingHeight = scanner.nextDouble();
            
            totalAreaOpenings += openingWidth * openingHeight;
        }

        areaToCover = areaWalls - totalAreaOpenings;

       areaPerRoll = rollWidthInches * rollLengthYards * 36;
       
         rollsNeeded =(int)Math.ceil(areaToCover / areaPerRoll);

        
        System.out.println("Number of rolls needed: " + rollsNeeded);

        scanner.close();
    }
}
