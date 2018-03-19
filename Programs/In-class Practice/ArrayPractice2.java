/* Array Practice 2
 * 6/28/16 */
import java.util.*;
import java.util.regex.*;

public class ArrayPractice2 {
  public static void main (String [] args) {
    ArrayList <String> inputArray = new ArrayList();
    Scanner scan= new Scanner (System.in);
    Pattern pat = Pattern.compile ("\\w+");
    Matcher mat;
    
    System.out.println("English");
    String input = scan.nextLine();
    input = input.toLowerCase();
    
    mat = pat.matcher(input);
    while (mat.find()) {
      inputArray.add(mat.group());
    }
    System.out.println(inputArray);
    

    
    
    
  }//END
}//END
