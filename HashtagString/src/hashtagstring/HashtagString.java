package hashtagstring;

import java.util.Scanner;

/**
 *
 * @author stefa
 */
public class HashtagString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a word:");
        String input = scanner.next();
        String newString = "";

        if (input.length() >= 3) {
            newString = input.substring(0, 3);
        } else if (input.length() == 1) {
            newString = input.substring(0) + "##";
        } else {
            newString = "###";
        }

        System.out.println(newString);
    }

}
