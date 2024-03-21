import java.util.Scanner;

public class TownDump {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
	    int pound, total, additionalCharge;
	    
	    System.out.print("Input the weight of a load pf trash (in pound) :");
	    pound = scan.nextInt();
	    
	   if (pound < 200)
	       total = 200;
	       
	    else{
	        additionalCharge = pound - 200;
	        total =((additionalCharge /100)*8) + 200;}
	        System.out.print("The total charge is : $"+ total);
	            
	       
	   
	       
	}
}