import java.util.Random;
import java.util.Scanner;

public class MultiplicationQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num1,num2,ans,correctAns;
        int correctCount = 0;
        
        
        for (int i = 1; i <= 10; i++) {
            num1 = random.nextInt(10); 
            num2 = random.nextInt(10); 
            
            System.out.print("What is " + num1 + " * " + num2 + "? ");
            ans = scanner.nextInt();

        
            correctAns = num1 * num2;
            
            if (ans == correctAns) {
                System.out.println("correct");
                correctCount++;
            } 
            else 
                System.out.println("Wrong. " + num1 + " * " + num2 + " is " + correctAns);
        };
       
        System.out.println("You got " + correctCount + " out of 10 questions correct!");
        
        scanner.close();
        
    }
}
