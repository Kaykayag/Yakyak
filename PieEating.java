import java.util.Scanner;

public class PieEating
{
	public static void main(String[] args)
	 {
		Scanner scan = new Scanner (System.in);
		int pounds;
		
		System.out.printf("input weight (pound): ");
		pounds = scan.nextInt();
		
		if (220 < pounds && pounds <= 250 )
		    System.out.println("You are allowed in the contest!");
		else 
		    System.out.println("You're not allowed in the contest!");
		    
		
	}
}