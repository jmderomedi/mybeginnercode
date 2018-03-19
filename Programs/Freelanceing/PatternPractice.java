/*Java API Pattern
 * 6/28/2016 */
import java.util.regex.*; 

public class PatternPractice {
  public static void main ( String [] args) {
    
    String str = "Hi there, \\how are you?";
    Pattern pat = Pattern.compile ("\\w+");
    Matcher mat = pat.matcher(str);
    while (mat.find()) {
      System.out.println(mat.group());
    }
  }//END
}//END