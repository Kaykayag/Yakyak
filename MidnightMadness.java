import java.util.Scanner;
public class MidnightMadness {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int time, age, ticketPrice;
		final int chargePrice = 4;
		final int adultNormal = 8;
		final int matineeAdult = 5;
		final int matineeChild = 2;
		
		System.out.printf("Input your age:");
		age = scan.nextInt();
		
		System.out.printf("Input time ( using 24hr format)");
		time= scan.nextInt();
   	
   
   	if (age >= 13){ 
   	     if (time > 2200){
       ticketPrice= adultNormal + chargePrice;
   System.out.printf("Total Amount: $"+ ticketPrice+".00");}
      	 else {
  	     ticketPrice = 5;
  	      System.out.printf("Total Amount: $"+ ticketPrice+".00");}
   	  }
     else {
            if (time > 2200)
               System.out.printf ("We are sorry to inform you that No children may purchase tickets after 10 pm");
   
           else 
            System.out.printf("Total Amount: $"+ matineeChild+ ".00");
     }
   	    
	}
}