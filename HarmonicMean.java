import java.util.Scanner;
public class HarmonicMean 
{
	public static void main(String[] args) 
	{
		double firstNum, secondNum, arithMean,harMean;
		Scanner scr = new Scanner (System.in);
		System.out.println("Enter X : ");
		firstNum = scr.nextDouble();
		
		System.out.println("Enter Y : ");
		secondNum = scr.nextDouble();
		
	    arithMean =(firstNum + secondNum )/2;
	    harMean = 2 / (1 / firstNum + 1 /  secondNum);
	    
	    System.out.println("Arithmetic mean : " + arithMean + "\nHarmonic mean : "+ harMean);
	    
		
	}
}