/*MoreMath Class
  Varargs demo
  MCS 141
  4/7/16 */

public class MoreMath {
//Method that finds the max of any number of integers
  
  public static int max (int... n ) {//accepts any number of int arguements
    if (n != null && n.length > 0 ) {//Makes sure that the arguements were passed
      int max = n[0];
      for (int i = 0; i<n.length; i++ ) {
        if (n[i] > max) {
         max = n[i]; 
        }
      }
      return max;
    }
    //Outside the IF must return something
    return Integer.MIN_VALUE;
  }
}//END