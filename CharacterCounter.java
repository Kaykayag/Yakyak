import java.util.Scanner;

public class CharacterCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int vowels = 0;
        char ch;
        int consonants = 0;
        int punctuation = 0;
        int spaces = 0;
        
        System.out.print("Enter a line of text: ");
         input = scanner.nextLine().toLowerCase();
        scanner.close();


        for (int i = 0; i < input.length(); i++) {
             ch = input.charAt(i);
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowels++;
                    break;
                case ' ':
                    spaces++;
                    break;
                case '.':
                case ',':
                case ';':
                case ':':
                case '!':
                case '?':
                    punctuation++;
                    break;
                default:
                    if (Character.isLetter(ch)) {
                        consonants++;
                    }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Punctuation: " + punctuation);
        System.out.println("Spaces: " + spaces);
    }
}
