/* MCS 141
 * 5/4/16 May the 4th be with you
 * FileReader
 * James Deromedi */
import java.io.*;
import java.util.*;

public class FileReader {
  public static void main (String [] args) {
    int [] counter = new int [91];
    
    try {
      Scanner file = new Scanner (new File ("input.txt"));
      while (file.hasNext() ) {
        String input = file.nextLine().toUpperCase();
        
        for(int i = 0; i <input.length(); i++) {
          if ((input.charAt(i) >= 'A') && (input.charAt(i) <= 'Z')) {
            counter[input.charAt(i)]++;
          }
        }
      }
      file.close();
      
      try {
        FileOutputStream fos = new FileOutputStream("frequency.txt", false);
        PrintWriter pw = new PrintWriter(fos);
        for(int i = 65; i<counter.length; i++){
          pw.println("" + (char)i + "-" +counter[i]); 
        }
        pw.close();
      }//END OF TRY
      catch(FileNotFoundException fnfe) {
        System.out.println("Cannot write to \"frequency.txt\"");
      }
    }//END OF FIRST TRY
    catch (FileNotFoundException fnfe){
      System.out.println("Could not find \"input.txt\"");
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}