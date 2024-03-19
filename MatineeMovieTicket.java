import java.util.Scanner;
public class MatineeMovieTicket {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int time, age, ticketPrice;
		
		System.out.printf("Input your age:");
		age = scan.nextInt();
		
		System.out.printf("Input time ( using 24hr format)");
		time= scan.nextInt();
   	
   
   	if (age >= 13){ 
   	     if (time > 1700 )
   	   ticketPrice = 8;
      	 else 
  	     ticketPrice = 5;
   	  }
     else {
            if (time > 1700 )
            ticketPrice = 4;
           else 
            ticketPrice = 2;
            
        }
   	   System.out.printf("Total Amount: $"+ ticketPrice + ".00");
   	    
	}
}