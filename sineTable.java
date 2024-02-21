import java.text.DecimalFormat;

public class SineTable 
{
    public static void main(String[] args) 
    {
        System.out.println("angle      sine");
        System.out.println("-----    --------");

        DecimalFormat sineFormat = new DecimalFormat("0.000000");

        System.out.println("-90.0     " + sineFormat.format(Math.sin(Math.toRadians(-90.0))));
        System.out.println("-75.0     " + sineFormat.format(Math.sin(Math.toRadians(-75.0))));
        System.out.println("-60.0     " + sineFormat.format(Math.sin(Math.toRadians(-60.0))));
        System.out.println("-45.0     " + sineFormat.format(Math.sin(Math.toRadians(-45.0))));
        System.out.println("-30.0     " + sineFormat.format(Math.sin(Math.toRadians(-30.0))));
        System.out.println("-15.0     " + sineFormat.format(Math.sin(Math.toRadians(-15.0))));
        System.out.println("0.0       " + sineFormat.format(Math.sin(Math.toRadians(0.0))));
        System.out.println("15.0      " + sineFormat.format(Math.sin(Math.toRadians(15.0))));
        System.out.println("30.0      " + sineFormat.format(Math.sin(Math.toRadians(30.0))));
        System.out.println("45.0      " + sineFormat.format(Math.sin(Math.toRadians(45.0))));
        System.out.println("60.0      " + sineFormat.format(Math.sin(Math.toRadians(60.0))));
        System.out.println("75.0      " + sineFormat.format(Math.sin(Math.toRadians(75.0))));
        System.out.println("90.0      " + sineFormat.format(Math.sin(Math.toRadians(90.0))));
    }
}
