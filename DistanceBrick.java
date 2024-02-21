import java.util.Scanner;

public class DistanceBrick
{
    public static void main(String[] args)
    {
        float seconds, distance;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number of seconds: ");
        seconds = scan.nextFloat();
        
        // Calculate the distance using the formula
        distance = 0.5f * 32.174f * (float) Math.pow(seconds, 2);
        
        System.out.println("Distance: " + distance);
    }
}
