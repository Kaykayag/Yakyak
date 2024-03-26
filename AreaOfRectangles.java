import java.util.Scanner;

public class AreaOfRectangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
             int x1,y1,x2,y2;
             int width,height,area;
             
        System.out.println("Computer Aided Design Program");

        while (true) {
            System.out.println("First corner X coordinate:");
             x1 = scanner.nextInt();
             
            System.out.println("First corner Y coordinate:");
             y1 = scanner.nextInt();
            System.out.println("Second corner X coordinate:");
             x2 = scanner.nextInt();
             
            System.out.println("Second corner Y coordinate:");
             y2 = scanner.nextInt();

            if (x1 == x2 || y1 == y2) {
                System.out.println("Width: 0  Height: 0  Area: 0 ");
                break;
            }

             width = Math.abs(x2 - x1);
             height = Math.abs(y2 - y1);
             area = width * height;

            System.out.println("Width:  " + width + "  Height: " + height + "   Area: " + area);
        }

        System.out.println("finished");

        scanner.close();
        
    }
}
