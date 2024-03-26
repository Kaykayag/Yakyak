import java.util.Scanner;

public class SumOfSequentialIntegers {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int n ;
		int i= 1;
		int loop= 0;
		int sum;
		
		System.out.print("Enter N: ");
		n= scan.nextInt();
		
	
		while (i <= n){
	    	loop +=i;
	    	i++;
	    	}
	    	
	    	System.out.print("Loop Sum : "+ loop);
	    	
		sum = (n*(n+1))/2;
		
		System.out.print("\nFormula Sum: "+ sum);
		
		scan.close();
		
	}
}