import java.util.Scanner;
public class HarmonicSum {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double sum =0;
		double numb;
		int i= 1;
		
		System.out.print("Enter N: ");
		numb= scan.nextDouble();
		
		while (i <= numb){
		    sum += 1.0/i;
		    i++;
		    }
		    
		    System.out.println("Sum is : "+ sum);
	}
}