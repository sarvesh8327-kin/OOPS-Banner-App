/**
 * OOPSBannerApp UC4 – OOPS Banner Application (Array & Loops)
 *
 * This version improves UC3 by storing the banner lines
 * inside a String array and printing them using a loop.
 * This reduces repetition and improves modularity.
 *
 * @author Sarvesh
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Store banner lines in an array
        String[] banner = {
            String.join(" ", " ***** ", " ***** ", " ****** ", " ***** "),
            String.join(" ", "*     *", "*     *", "*     *", "*     *"),
            String.join(" ", "*     *", "*     *", "*     *", "*      "),
            String.join(" ", "*     *", "*     *", "****** ", " ***** "),
            String.join(" ", "*     *", "*     *", "*      ", "     * "),
            String.join(" ", "*     *", "*     *", "*      ", "*    * "),
            String.join(" ", " ***** ", " ***** ", "*      ", " ****  ")
        };

        // Loop through array and print each line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}