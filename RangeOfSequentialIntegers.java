import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int low,high;
		int sum= 0;
		int i = 1;
		
		
		System.out.print("Enter Low: ");
		low = scan.nextInt();
		System.out.print("Enter High: ");
		high = scan.nextInt();
		
		i= low;
		while(i <= high ){
		    sum += i;
		    i++;
		    
	}
	System.out.print("Sum: "+ sum);
	
	scan.close();
	}
}