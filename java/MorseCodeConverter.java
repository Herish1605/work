import java.util.Scanner;

public class MorseCodeConverter {

    
    private static final String[] letters = {
        "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
        "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
        "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
    };

    private static final String[] morseCodes = {
        ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
        "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
        "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to convert to Morse code or Morse code to convert to string:");
        String input = scanner.nextLine().toUpperCase();

        if (isValidInput(input)) {
            if (input.contains("-") || input.contains(".")) {
                String result = morseToText(input);
                System.out.println("Converted to text: " + result);
            } else {
                String result = textToMorse(input);
                System.out.println("Converted to Morse code: " + result);
            }
        } else {
            System.out.println("Invalid input. Please enter letters, digits, or spaces only.");
        }
    }

    
    private static String textToMorse(String text) {
        StringBuilder morse = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                morse.append("   "); 
            } else {
                int index = getIndex(ch);
                if (index != -1) {
                    morse.append(morseCodes[index]).append(" ");
                }
            }
        }
        return morse.toString().trim();
    }

    
    private static String morseToText(String morse) {
        StringBuilder text = new StringBuilder();
        String[] words = morse.split("   "); 
        for (String word : words) {
            String[] codes = word.split(" ");
            for (String code : codes) {
                int index = getIndexFromMorse(code);
                if (index != -1) {
                    text.append(letters[index]);
                }
            }
            text.append(" "); 
        }
        return text.toString().trim();
    }

    
    private static int getIndex(char ch) {
        for (int i = 0; i < letters.length; i++) {
            if (letters[i].equalsIgnoreCase(String.valueOf(ch))) {
                return i;
            }
        }
        return -1; 
    }

    
    private static int getIndexFromMorse(String code) {
        for (int i = 0; i < morseCodes.length; i++) {
            if (morseCodes[i].equals(code)) {
                return i;
            }
        }
        return -1; 
    }

    
    private static boolean isValidInput(String input) {
        return input.matches( "[A-Z0-9 ]+");
    }
}
      
       