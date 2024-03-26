import java.util.Scanner;
public class WedgeOfStars {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int star;
		
		System.out.print("Initial number of stars: ");
		star = scan.nextInt();
		
		for (int i = star; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
		}
	}
}