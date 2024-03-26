import java.util.Scanner;
public class OneLetterPerLine {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String word;
		int theLength;
		int i= 0;
		
		System.out.print("Enter a Word:");
		word = scan.nextLine();
		
		theLength = word.length();
		
		while (i < theLength){
		  
		    System.out.println(word.charAt(i));
		    i++;
		    }
		    
		    scan.close();
	}
}