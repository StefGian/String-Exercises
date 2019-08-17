package copylastchars;

import java.util.Scanner;

/**
 *
 * @author stefa
 */
public class CopyLastChars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type something:");
        String input = scanner.next();

        String lastThreeChars = "";

        if (input.length() > 3) {
            lastThreeChars = input.substring(input.length() - 3);
        } else {
            lastThreeChars = input;
        }

        String newString = lastThreeChars + "." + lastThreeChars + "." + lastThreeChars + "." + lastThreeChars;
        System.out.println(newString);
    }

}
