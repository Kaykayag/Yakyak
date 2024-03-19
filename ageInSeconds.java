import java.util.Scanner;

public class AgeInSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years,months,days, totalDays, ageInSeconds;
        double expectedLifespanSeconds;
        double percentageLived;
       
        System.out.print("Enter your age in years: ");
         years = scanner.nextInt();
        System.out.print("Enter your age in months: ");
         months = scanner.nextInt();
        System.out.print("Enter your age in days: ");
        days = scanner.nextInt();
        
      
         totalDays = years * 365; 
        totalDays += days; 
         ageInSeconds = totalDays * 24 * 60 * 60; 
            if (months >= 1) totalDays += 31;
        if (months >= 2) totalDays += 28; 
        if (months >= 3) totalDays += 31;
        if (months >= 4) totalDays += 30; 
        if (months >= 5) totalDays += 31;
        if (months >= 6) totalDays += 30;
        if (months >= 7) totalDays += 31;
        if (months >= 8) totalDays += 31;
        if (months >= 9) totalDays += 30;
        if (months >= 10) totalDays += 31;
        if (months >= 11) totalDays += 30;
        
        System.out.println("Your age in seconds is: " + ageInSeconds);
       
        expectedLifespanSeconds = 2.5 * 1e9; 
        percentageLived = (ageInSeconds / expectedLifespanSeconds) * 100;
        
        System.out.println("You have lived " + percentageLived + "% of your expected lifespan.");
   
    
   
    }
}