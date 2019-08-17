package halfstring;

import java.util.Scanner;

/**
 *
 * @author stefa
 */
public class HalfString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Please type something:");
        String input = scanner.next();
        
        int length = input.length()/2;
        String firstHalf = input.substring(0, length);
        System.out.println("The first even half of the string you typed is: ");
        System.out.println(firstHalf);
    }
    
}
