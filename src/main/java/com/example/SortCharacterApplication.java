import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SortCharacterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SortCharacterApplication.class, args);
    }

    public static String sortCharacters(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();

        for (char c : input.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                if (isVowel(c)) {
                    vowels.append(c);
                } else {
                    consonants.append(c);
                }
            }
        }

        return "vowel characters: " + vowels.toString() + " | consonant characters: " + consonants.toString();
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
