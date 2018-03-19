/* Chapter 2 Programming Assignments
 * 6/23/2016 */
public class ChapterTwo {
  public static void main ( String [] args) {
    
    /*Calculates and outputs the square roots from 1 to 9 */
    for (double i = 1; i < 10; i++) {
      double n = Math.sqrt (i);
      System.out.println(n);
    }
    
    /*Calculates and outputs the average of 1, 5, 12, 13.0 */
    int avg = 1 + 5 + 12 + (int)(13.0);
    avg /= 4;
    System.out.println (avg);
  } //END
} // END