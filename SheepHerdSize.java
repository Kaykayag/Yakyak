public class SheepHerdSize {
    public static void main(String[] args) {
        double population;
        double power = 1;

        for (int t = 0; t <= 25; t++) {
            population = 220 / (1 + 10 * power);
            System.out.println("Year " + t + ": Population = " + population);

            power *= 0.83;  
         }
    }
}
