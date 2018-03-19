/*MCS 141
 * 5/3/16
 * input/output demo with error handling
 * Reads input from a text file 
 * outputs results in reverse order to a new file */

import java.util.*;
/*FileNotFoundExpection located here */
import java.io.*;

public class ReadAndWrite {
  public static void main (String [] args) {
    String input;
    String output;
    
    //Checks for FileNotFoundException
    try {
      Scanner file = new Scanner (new File ("inputstring.txt") );
      input = file.nextLine();
      //Reverses the input
      output = "";
      for (int i = 0; i<input.length(); i++)
      {
        //adds each new characters to the begining of the string
        output = input.charAt(i) + output; 
      }
      //close scanner, which also closes the file
      file.close(); 
      
      /*Test ouput
       System.out.println(input);
       System.out.println(output);*/
      
      try{ //Innertry block for output
        FileOutputStream fos = new FileOutputStream("output.txt", false);
        //"false" means we write instead of append
        PrintWriter pw = new PrintWriter(fos);
        //PrintWriter works just like system.out
        pw.println("Orginal text: " + input);
        pw.println("Reversed text: " +output);
        
        pw.close();
      }//END INNER TRY BLOCK
      catch(FileNotFoundException fnfe) {
        System.out.println("Cannot write to output.txt");
      }
    }//END OUTER TRY BLOCK
    
    catch (FileNotFoundException fnfe) {
      System.out.println("Could not find inputstring.txt"); 
    }
    //Catches any other execption from outer try block
    catch (Exception e) {
      //Prints the diagnostic data to console
      e.printStackTrace();
    }
    
  }//END
}//END