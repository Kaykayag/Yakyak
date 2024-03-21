import java.util.Scanner;

public class CheckCharge {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int checkingAcc,savingAcc;
		
		System.out.print("Input your checking Account balance: ");
		checkingAcc = scan.nextInt();
		
		System.out.print("Input your Saving Account balance: ");
		savingAcc = scan.nextInt();
		
		if (checkingAcc > 1000 || savingAcc > 1500)
		    System.out.print(" Service fee : $0.00");
 	 else 
 	     System.out.print("Service Fee : $0.15");
 	     
	}
}