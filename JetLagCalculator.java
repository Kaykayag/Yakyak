    import java.util.Scanner;
    
    public class JetLagCalculator {
    	public static void main(String[] args) {
    		
    		Scanner scan = new Scanner (System.in);
    		int hrs,zone,depart,arrive;
    		int departNum,arriveNum;
    		double recovery;
    		
    		
    		System.out.println("Input Number of hours of travel: ");
    		hrs = scan.nextInt();
    		System.out.println("Input number of timr Zones crossed: ");
    		zone = scan.nextInt();
    		System.out.println("Input the departure time: ");
    		depart = scan.nextInt();
    		System.out.println("Input the arrival time: ");
    		arrive = scan.nextInt();
    		
    		
    		if (depart>=8 && depart<12)
    		    departNum= 0;
    		else if (depart>=13 && depart <18)
    		    departNum= 1;
    		else if (depart>=19 && depart <22)
    		    departNum=3;
    		 else if (depart>=23 && depart <1)
    		     departNum= 4;
    		 else 
    		     departNum=5;
    		 
    		 if (arrive >=8 && arrive <12)
    		     arriveNum= 4;
    		 else if (arrive>=13 && arrive<18)
    		     arriveNum=2;
    		 else if (arrive>= 19 && arrive <22)
    		     arriveNum= 0;
    		 else if (arrive>=23 && arrive<1)
    		     arriveNum= 1;
    		  else 
    		      arriveNum=3;
    		      
    		   
    		   recovery=   (hrs/2 + (zone-3) + departNum + arriveNum)/10;
    		   
    		   System.out.print("days of recovery : "+ recovery +" day(s)");
    		   
    	scan.close();	   
    	}
    }