import java.util.Scanner;

public class FantasyGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int strength, health, luck, total;
		String character;
		System.out.println("Welcome to Yertle's Quest");
		
		System.out.println("Enter the name of your character: ");
		character = scan.nextLine();
		
		System.out.println("Enter Strength(1-10): ");
		strength = scan.nextInt();
		
		System.out.println("Enter Health(1-10): ");
		health = scan.nextInt();
		
		System.out.println("Enter luck(1-10): ");
		luck = scan.nextInt();
		
		total = strength + health + luck;
		
		if (total > 15)
		    System.out.println(" You have give your character too many points!  Default values have been assigned:\n"+ character + " , strength: 5, health: 5, luck: 5");
		  else 
		      System.out.println(character + " ,strength: "+ strength + " , health: "+ health + " , luck: "+ luck);
		    
	}
}