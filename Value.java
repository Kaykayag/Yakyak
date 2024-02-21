import java.util.Scanner;
import java.text.*;

public class Value
{
	public static void main(String[] args) 
	{
		double deposit,timeYear,numYear, interestR, val;
		Scanner scr = new Scanner (System.in);
		
		System.out.println("Initial Deposit: ");
		deposit = scr.nextDouble();
		System.out.println("Interest Rate: ");
		interestR = scr.nextDouble();
		System.out.println("Times per year : ");        timeYear = scr.nextDouble();
		System.out.println("Number of years");
		numYear = scr.nextDouble();
		
		val = deposit  * Math.pow((1+ interestR/timeYear), (timeYear*numYear));
	
			DecimalFormat numform = new DecimalFormat("0.00"); 
System.out.println( "Value:$" + numform.format(val) );
		
		
				}
}