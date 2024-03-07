import java.util.Scanner;

public class ChanceGas
 {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		int capacity,gauge,miles, remainTank;
		
		System.out.println("Tank Capacity: ");
		capacity = scan.nextInt();
		System.out.println("Gauge Reading: ");
		gauge = scan.nextInt();
		System.out.println("Miles per gallon: ");
		miles = scan.nextInt();
		
		remainTank = gauge * capacity * miles/100;
		
		if (remainTank >= 200)
		    System.out.println("Safe to Proceed!");
		    
		 else 
		     System.out.println("Get Gas!");
	}
}