
import java.util.Scanner;

public class LogarithmBase
 {
	public static void main(String[] args) 
	{
        double num, theLog;
        Scanner scr = new Scanner (System.in);
        System.out.println("Enter a double: ");
        num = scr.nextDouble();
        
        theLog = (Math.log(num)/ Math.log(2));
        System.out.println("Base 2 log of " + num + " is " + theLog);
        
	}
}