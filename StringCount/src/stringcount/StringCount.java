package stringcount;

import java.util.Scanner;

/**
 *
 * @author stefa
 */
public class StringCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type something:");
        String text = scanner.nextLine();

        int countLetters = 0;
        int countSpaces = 0;
        int countNumbers = 0;
        int countOthers = 0;
        System.out.println("The String you typed is: " + text);
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                countLetters++;
            } else if (Character.isSpaceChar(text.charAt(i))) {
                countSpaces++;
            } else if (Character.isDigit(text.charAt(i))) {
                countNumbers++;
            } else {
                countOthers++;
            }
        }
        System.out.println("letters: " + countLetters);
        System.out.println("spaces: " + countSpaces);
        System.out.println("numbers: " + countNumbers);
        System.out.println("others: " + countOthers);
    }

}
