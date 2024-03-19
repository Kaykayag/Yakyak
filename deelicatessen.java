import java.util.Scanner;

public class InternetDelicatessen{
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
	    
	String item;
	float price, total;
	float delivery, shipping;
	final float regDelivery = 2.00f;
	final float expressDelivery = 3.00f;
	
	
	System.out.printf(" Enter the item: ");
	item = scan.nextLine();
    System.out.printf("Enter the price: ");
    price = scan.nextFloat();
     System.out.printf("Overnight delivery(0==no, 1==yes:");
     delivery = scan.nextInt();
     
     System.out.print("Invoice: \n"+ item+"\t\t" +price);
    
     shipping = regDelivery+ expressDelivery;
     
     if (delivery <10)
          if (delivery== 1)
              
        System.out.printf("\nDelivery\t"+shipping);
         else
        System.out.printf("\nDelivery\t"+ regDelivery);
     
         total= price + shipping;
     System.out.print("\nTotal \t\t"+total);
	}
}