import java.util.Random;

public class CharacterGenerator {

    public static void main(String[] args) {
        Random random = new Random();

        String firstName = "";
        String lastName = "";
        int firstNameIndex, lastNameIndex,
       
       firstNameIndex = random.nextInt(12) + 1;
        switch (firstNameIndex) {
            case 1:
                firstName = "John";
                break;
            case 2:
                firstName = "Alice";
                break;
            case 3:
                firstName = "Michael";
                break;
            case 4:
                firstName = "Emma";
                break;
            case 5:
                firstName = "James";
                break;
            case 6:
                firstName = "Emily";
                break;
            case 7:
                firstName = "William";
                break;
            case 8:
                firstName = "Olivia";
                break;
            case 9:
                firstName = "Alexander";
                break;
            case 10:
                firstName = "Sophia";
                break;
            case 11:
                firstName = "Daniel";
                break;
            case 12:
                firstName = "Isabella";
                break;
            default:
                firstName = "Unknown";
        }

      
         lastNameIndex = random.nextInt(12) + 1;
        switch (lastNameIndex) {
            case 1:
                lastName = "Smith";
                break;
            case 2:
                lastName = "Johnson";
                break;
            case 3:
                lastName = "Williams";
                break;
            case 4:
                lastName = "Brown";
                break;
            case 5:
                lastName = "Jones";
                break;
            case 6:
                lastName = "Garcia";
                break;
            case 7:
                lastName = "Miller";
                break;
            case 8:
                lastName = "Davis";
                break;
            case 9:
                lastName = "Taylor";
                break;
            case 10:
                lastName = "Anderson";
                break;
            case 11:
                lastName = "Thomas";
                break;
            case 12:
                lastName = "White";
                break;
            default:
                lastName = "Unknown";
        }

        System.out.println("Generated character name: " + firstName + " " + lastName);
    }
}
