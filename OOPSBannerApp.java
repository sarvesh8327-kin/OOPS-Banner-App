/**
 * OOPSBannerApp UC3 – OOPS Banner Application (Use Case 3)
 *
 * This class improves UC2 by replacing string concatenation (+)
 * with the String.join() method to build each banner line.
 * This approach reduces intermediate string objects and
 * improves memory efficiency while keeping the same output.
 *
 * @author Sarvesh
 * @version 3.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join(" ", " ***** ", " ***** ", " ****** ", " ***** "));
        System.out.println(String.join(" ", "*     *", "*     *", "*     *", "*     *"));
        System.out.println(String.join(" ", "*     *", "*     *", "*     *", "*     "));
        System.out.println(String.join(" ", "*     *", "*     *", "****** ", " ***** "));
        System.out.println(String.join(" ", "*     *", "*     *", "*      ", "     *"));
        System.out.println(String.join(" ", "*     *", "*     *", "*      ", "*    *"));
        System.out.println(String.join(" ", " ***** ", " ***** ", "*      ", " **** "));

    }
}