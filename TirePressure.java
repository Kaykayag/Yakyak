import java.util.Scanner;

public class TirePressure {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int rightFront, leftFront, rightRear, leftRear;
		
		System.out.println("Input right front pressure : ");
		rightFront = scan.nextInt();
		
		System.out.println("Input left front pressure : ");
		leftFront = scan.nextInt();
		
		System.out.println("Input right rear pressure : ");
		rightRear = scan.nextInt();
		
		System.out.println("Input left Rear pressure : ");
		leftRear = scan.nextInt();
		
		if (rightFront==leftFront && rightRear== leftRear)
		    System.out.println("Inflation  is OK");
		else 
		    System.out.println("Inflation is not OK");
		    
	}
}