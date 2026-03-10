/**
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 *
 * This version improves UC4 by declaring and initializing the String array
 * in a single statement using String.join() calls for each banner line.
 *
 * @author Sarvesh
 * @version 5.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Declare and initialize banner lines in one statement
        String[] lines = {
            String.join(" ", " ***** ", " ***** ", " ****** ", " ***** "),
            String.join(" ", "*     *", "*     *", "*     *", "*     *"),
            String.join(" ", "*     *", "*     *", "*     *", "*      "),
            String.join(" ", "*     *", "*     *", "****** ", " ***** "),
            String.join(" ", "*     *", "*     *", "*      ", "     * "),
            String.join(" ", "*     *", "*     *", "*      ", "*    * "),
            String.join(" ", " ***** ", " ***** ", "*      ", " ****  ")
        };

        // Print banner using loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}