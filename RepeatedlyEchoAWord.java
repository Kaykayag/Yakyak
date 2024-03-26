import java.util.Scanner;

public class RepeatedEchoAWord{
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String inputString;
		int times;
		int i=0;
		
		System.out.print("Enter a word: ");
		inputString= scan.nextLine();
		
		times = inputString.length();
		
		while( i <times){
		    i++;
		
		System.out.println(inputString);
		}
	}
}