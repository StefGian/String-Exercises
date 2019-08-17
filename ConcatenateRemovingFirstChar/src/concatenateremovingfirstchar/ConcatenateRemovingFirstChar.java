package concatenateremovingfirstchar;

import java.util.Scanner;

/**
 *
 * @author stefa
 */
public class ConcatenateRemovingFirstChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first word:");
        String input1 = scanner.next();
        System.out.println("Insert second word:");
        String input2 = scanner.next();
        
        String newString = input1.substring(1)+ input2.substring(1);
        System.out.println("New string: " + newString);
        
    }
    
}
