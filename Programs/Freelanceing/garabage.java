import java.util.*;
import java.text.*;

public class  garabage {
  public static void main ( String [] args ) {
    Scanner scan = new Scanner(System.in);
    int f;
    int num = 234234;
    
    
    f = percentFormat(num);
    System.out.println(f);
  }
  public static int percentFormat (int num) {
    DecimalFormat percent = new DecimalFormat("0.0#%");
    percent.format(num);
    return num;
  }
}