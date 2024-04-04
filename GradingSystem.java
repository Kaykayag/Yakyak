import java.util.Scanner;
public class GradingSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte option;
        double quizGrade, labworksGrade, examGrade, avg;

        do {
            System.out.println("\nOptions:");
            System.out.println("[1] Compute Midterm Grade");
            System.out.println("[2] Compute Final Grade");
            System.out.println("[3] Quit App");
            System.out.print("Press 1, 2, or 3: ");
            option = scan.nextByte();

            switch (option) {
                case 1, 2:
                    System.out.print("\nEnter your Quiz Grade: ");
                    quizGrade = scan.nextDouble();
                    System.out.print("Enter your Labworks Grade: ");
                    labworksGrade = scan.nextDouble();
                    System.out.print("Enter your " + (option == 1 ? "Midterm" : "Final") + " Exam Grade: ");
                    examGrade = scan.nextDouble();

                    if (quizGrade > 5.0 || labworksGrade > 5.0 || examGrade > 5.0) {
                        System.out.println("\n>>> Grades must not be beyond 5.0 <<<");
                        continue;
                    }

                    avg = (quizGrade + labworksGrade + examGrade) / 3;
                    System.out.printf((option == 1 ? "\nMidterm" : "Final") + " Grade: %.1f\n", avg);
                    System.out.println(avg >= 3.0 ? "Remarks: PASSED" : "Remarks: FAIL");
                    break;

                case 3:
                    System.out.println("\nBye!");
                    break;

                default:
                    System.out.println("\n>>> Input is not among the options <<<");
                    break;
            }

        } while (option != 3);
    }
}