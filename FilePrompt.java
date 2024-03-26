import java.util.Scanner;

public class FilePrompt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "";
        String name ,extension;
        int dotIndex;

        while (true) {
            System.out.print("Input file: ");
            fileName = scanner.nextLine().trim();

            if (fileName.isEmpty()) {
                System.out.println(">>> File name missing <<<");
                continue;
            }

             dotIndex = fileName.lastIndexOf('.');
            if (dotIndex == -1) {
                System.out.println(">>> File name must end with .dat <<<");
                continue;
            }

             name = fileName.substring(0, dotIndex);
             extension = fileName.substring(dotIndex);

            if (name.contains(" ") || !extension.equals(".dat")) {
                if (name.contains(" ")) {
                    System.out.println(">>> File name must not contain spaces <<<");
                }
                if (!extension.equals(".dat")) {
                    System.out.println(">>> File extension must be .dat <<<");
                }
                continue;
            }

            break; 
        }

        System.out.println("OK");
        scanner.close();
    }
}
