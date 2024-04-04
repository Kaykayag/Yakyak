import java.util.Scanner;
import java.text.DecimalFormat;

public class GradingSystem {
	public static void main(String[] args) {
		
		int pickOption;
		double quizGrade,labWork,examGrade,yourGrade;
		boolean padayon;
		Scanner scan = new Scanner(System.in);
	DecimalFormat sch = new DecimalFormat("0.0");
	
	do{ //do while to let the user continue choose from the option
  	do{  //do while if the user input numbers other than 1,2, and 3	
		System.out.println("GRADING SYSTEM\nOption");
		System.out.println("[1] Compute Midterm Grade");
		System.out.println("[2] Compute Final Grade");
		System.out.println("[3] Quit App");
		System.out.printf("Press 1,2, or 3: ");
		pickOption = scan.nextInt();
		
	    if (pickOption!= 1&& pickOption!=2 && pickOption != 3)
	    System.out.println("Choose one of the given option\n");
	    
	}
  	while(pickOption!= 1&& pickOption!=2 && pickOption != 3 );
	
		switch(pickOption){
		 case 1:
		 System.out.printf("Enter your Quiz Grade: ");
		 quizGrade=scan.nextDouble();
		 System.out.printf("Enter your Labwork Grade: ");
		 labWork=scan.nextDouble();
		 System.out.printf("Enter your Midterm Exam Grade: ");
		 examGrade=scan.nextDouble();
		 	 
		 yourGrade=(quizGrade*0.2)+(labWork*0.4)+(examGrade*0.4);
		 /*quiz - 20% ; labwork - 40% ; midterm Exam - 40%*/
		 	 
		 System.out.print("Midterm Grade:"+ sch.format(yourGrade));
		 
		 if (yourGrade<4.0)
		 System.out.println("\nRemarks: PASSED");
		 else 
		 System.out.println("\nRemarks: FAILED");
	    break;
		case 2:
	     System.out.printf("Enter your Quiz Grade: ");
		 quizGrade=scan.nextDouble();
		 System.out.printf("Enter your Labwork Grade: ");
		 labWork=scan.nextDouble();
		 System.out.printf("Enter your Final Exam Grade: ");
		 examGrade=scan.nextDouble();
		 
		 yourGrade=(quizGrade*0.2)+(labWork*0.4)+(examGrade*0.4);
		 	 /*quiz - 20% ; labwork - 40% ; midterm Exam - 40%*/
		 	 
		 	 
		 System.out.println("Final Grade :"+ sch.format(yourGrade));
		 
		 if (yourGrade<4.0)
		 System.out.println("\nRemarks: PASSED");
		 else 
		 System.out.println("\nRemarks: FAILED");
		 break;
		 case 3:
		 System.out.println("You Quit");
		 break;
	}
   	if(pickOption != 3){
           System.out.println("Still want to continue? [True / False]"); //question after the user got their grades, asking them to continue or not. excluding the case 3.
            padayon = scan.nextBoolean();
            } 
            else 
                padayon = false; //if mag false gani ang user, ma exit na sila
                  
	}//curly bracr from the do while nga nag ask sa user to continue
	while(padayon);
		 
		
	}
}