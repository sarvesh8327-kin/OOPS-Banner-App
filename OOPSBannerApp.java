import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp UC8 – Render Banner using HashMap
 *
 * This version stores ASCII patterns in a HashMap where each
 * character maps to its corresponding banner pattern.
 *
 * @author Sarvesh
 * @version 8.0
 */

public class OOPSBannerApp {

    // Create and initialize map of character patterns
    public static Map<Character, String[]> createCharacterPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });

        map.put(' ', new String[]{
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     "
        });

        return map;
    }

    // Function to print banner message
    public static void printBanner(String message, Map<Character, String[]> patterns) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = patterns.getOrDefault(ch, patterns.get(' '));
                line.append(pattern[row]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patterns = createCharacterPatterns();

        String message = "OOPS";

        printBanner(message, patterns);
    }
}