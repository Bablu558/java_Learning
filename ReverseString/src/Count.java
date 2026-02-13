import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        
        // Initialize counters
        int vowels = 0;
        int consonants = 0;
        int numbers = 0;
        int specialCharacters = 0;
        
        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            
            char lowerCaseCh = Character.toLowerCase(ch);
            
            
            switch (lowerCaseCh) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowels++;
                    break;
                default:
                    if (lowerCaseCh >= 'a' && lowerCaseCh <= 'z') {
                        consonants++;
                    } else if (ch >= '0' && ch <= '9') {
                        numbers++;
                    } else {
                        specialCharacters++;
                    }
                    break;
            }
        }
        
        // Print the final counts
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Numbers: " + numbers);
        System.out.println("Special Characters: " + specialCharacters);
    }
}