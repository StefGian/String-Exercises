package stringtests;

import java.util.Scanner;

/**
 *
 * @author stefa
 */
public class StringTests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner (System.in);
  
        System.out.println("Please type something:");
        String text = scanner.nextLine();
  
        
        //First way using StringBuilder reverse() :
        
        StringBuilder builder = new StringBuilder();
        builder.append(text);
        builder = builder.reverse();
        System.out.println(builder);
        
        //Second way converting String to charArray :
        
        char [] array = text.toCharArray();
        for(int i = array.length-1; i >= 0; i--){       
            System.out.print(array[i]);
        }
    }
    
    
}
