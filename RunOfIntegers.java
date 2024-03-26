import java.util.Scanner;
public class RunOfIntegers {
	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	int startNum, endNum;
	int count=0;
	
	
	System.out.print("Enter Start: ");
	startNum = scan.nextInt();
	System.out.print("Enter End :");
	endNum = scan.nextInt();
	
	while(startNum<=endNum)
	{
	    System.out.print(startNum +"\n");
	    startNum +=1;
	    
	    }
	}
}