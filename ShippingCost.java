import java.util.Scanner;

public class ShippingCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          int weight;
          double handlingFee = 3.00;
          double freeShippingLimit = 10;
          double perPoundRate = 0.25;
          double shippingCost, excessWeight,excessShippingCost;
          
        System.out.println("Weight of Order:");

        while (true) {
             weight = scanner.nextInt();

            if (weight <= 0) {
                break;
            }

            if (weight <= freeShippingLimit) 
                shippingCost = handlingFee;
            else {
                 excessWeight = weight - freeShippingLimit;
                 excessShippingCost = excessWeight * perPoundRate;
                shippingCost = handlingFee + excessShippingCost;
            }

            System.out.printf("Shipping Cost: $"+shippingCost);
        }

        System.out.println("bye");

        scanner.close();
    }
}
