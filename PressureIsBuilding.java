import java.util.Scanner;

public class PressureIsBuilding {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int rightFront, leftFront, rightRear, leftRear;
		boolean goodPressure= true;
		
		System.out.println("Input right front pressure : ");
		rightFront = scan.nextInt();
		
			if (rightFront < 35 || rightFront > 45){ 
            goodPressure = false; 
            System.out.println("\nWarning: pressure is out of range \n");
        }
	
		System.out.println("Input left front pressure : ");
		leftFront = scan.nextInt();
		
		  if (leftFront< 35 || leftFront> 45) {          goodPressure = false;
            System.out.println("\nWarning: pressure is out of range\n ");}
        
		if ((rightFront-leftFront )<3)
		        System.out.print("The tires should be within 3 psi of each other\n");
	  
		System.out.println("Input right rear pressure : ");
		rightRear = scan.nextInt();
		
		 if (rightRear < 35 || rightRear >45) {
            goodPressure = false;
            System.out.println("\nWarning: pressure is out of range\n");}
		
		System.out.println("Input left Rear pressure : ");
		leftRear = scan.nextInt();
		
    if (leftRear< 35 || leftRear> 45) 
            
            System.out.println("\nWarning: pressure is out of range\n");
           
        
		if (rightRear-leftRear<3 )
		    System.out.print("The tires should be within 3 psi to each other\n");
		
		if (rightFront==leftFront && rightRear== leftRear)
		    System.out.println("Inflation  is OK");
		else 
		    System.out.println("Inflation is BAD");
		    
	}
}