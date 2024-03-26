import java.util.Scanner;

public class SquareAndCubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, squaresFormula,cubesFormula;
         int squares =0;
        int cubes= 0;
   
        System.out.print("Upper Limit: ");
        num= scanner.nextInt();

        for (int i =1;i <= num; i++) 
        {
            squares += i* i;
            cubes += i*i* i;
        }
        
        squaresFormula = (num * (num+ 1) * (2 *num + 1)) / 6;
        cubesFormula = (num*num* (num + 1) * (num+ 1)) / 4;

       
        System.out.println("The sum of Squares is  " + squares + " (Explicit summation)");
        System.out.println("The sum of Squares is  " + squaresFormula);
        System.out.println("The sum of Cubes   is  " + cubes + " (Explicit summation)");
        System.out.println("The sum of Cubes   is  " + cubesFormula);

        scanner.close();
    }
}
