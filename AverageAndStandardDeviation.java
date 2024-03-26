import java.util.Scanner;
public class AverageAndStandardDeviation {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double  numb, theNumb;
		double itsSquare=0;
		int i= 1;
		double avg, sD, squareAvg, avgSqr;
		double sum= 0;
		double sumSd= 0;
		
		
		System.out.print("Enter N:");
		numb = scan.nextDouble();
		
		while (i <= numb){
		    System.out.print("\nX"+ i+ ":     ");
		    theNumb= scan.nextDouble();
		     sum += theNumb;
		    itsSquare = theNumb* theNumb;
		   
		    System.out.print("X"+i+"*X"+i+":  "+itsSquare);
		   sumSd += itsSquare;
		    i++;
		    }
		    
		avg = sum / numb;
		avgSqr =avg * avg;
		squareAvg = sumSd/numb;
		
		sD= Math.sqrt( squareAvg- avgSqr);
		
	System.out.println("\nThe Average is : \n"+ avg);
	System.out.println("The Average²:"+ avgSqr);
	System.out.println("avgSquare :"+ squareAvg);
	System.out.println("SD: "+ sD);
		
	}
}