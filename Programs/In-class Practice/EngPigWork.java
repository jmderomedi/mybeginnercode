/* EngPig work
 * 6/29/16 */
import java.util.*;
import java.util.regex.*;

public class EngPigWork {
  public static void main (String [] args) {
    Scanner scan = new Scanner (System.in);
    ArrayList <String> wordArray = new ArrayList();
    ArrayList <String> symbolArray = new ArrayList();
    Pattern wordPat = Pattern.compile ("\\w+");
    Pattern SymbolPat = Pattern.compile ("\\W+");
    Matcher mat;
    
    System.out.println("Enter");
    String input = scan.nextLine();
    mat = pat.matcher(input);
    while (mat.find()) {
      wordArray.add(mat.group());
    }
    while (mat.find()) {
      SymbolArray.add(mat.group());
    }
    System.out.println(inputArray);  
    String [] list = new String [inputArray.size()];
    for (int i = 0; i < list.length; i++) {
      list[i] = inputArray.get(i);
    }
    for ( int i = 0; i<list.length; i++) {
      System.out.print(list[i] + " ");
    }
  }//END
}//END
