import java.util.Scanner;
public class StreamEngineEfficiency{
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		float tSteam, tair;
		float efficiency;
		
		System.out.printf("Input air temperature: ");
		tair = scan.nextFloat();
		
		System.out.printf("Input steam Temperature: ");
		tSteam = scan.nextFloat();
		
	
		if (tSteam > 373){
		    efficiency = 1- (tair/ tSteam);
		    System.out.printf("Maximum possible efficiency of a steam engine is "+ efficiency);
		    }
		else
		System.out.printf("There is no steam");
		
	
		      
		
		
	}
}