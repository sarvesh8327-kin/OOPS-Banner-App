/**
 * OOPSBannerApp UC6 – OOPS Banner Application (Static Functions)
 *
 * This version improves UC5 by creating reusable helper methods
 * to generate ASCII patterns for the letters O, P, and S.
 *
 * @author Sarvesh
 * @version 6.0
 */

public class OOPSBannerApp {

    // Pattern for letter O
    public static String[] getOPattern() {
        return new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        };
    }

    // Pattern for letter P
    public static String[] getPPattern() {
        return new String[]{
                " ***** ",
                " *   * ",
                " *   * ",
                " ***** ",
                " *     ",
                " *     ",
                " *     "
        };
    }

    // Pattern for letter S
    public static String[] getSPattern() {
        return new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };
    }

    public static void main(String[] args) {

        // Get patterns
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Print banner line by line
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                    oPattern[i] + "  " +
                    oPattern[i] + "  " +
                    pPattern[i] + "  " +
                    sPattern[i]
            );
        }
    }
}