import java.util.Scanner;

public class SeparatedByDots{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstWord;
		String secondWord;
		int theDots;
		int i= 0;
		
		System.out.print("Enter first Word: ");
		firstWord = scan.nextLine();
		
    	System.out.print("Enter second Word:");
    	secondWord = scan.nextLine();
    	
    	theDots =30 -  firstWord.length() + secondWord.length() ;
    	
    	System.out.print(firstWord);
    	
    	while (i < theDots){
    	    i++;
    	    System.out.print(".");
    	}
    	System.out.print(secondWord);
    	
	}
}