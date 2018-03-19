/*James Deromedi
 * MCS 141
 * Exam Practice */

import java.util.*;

public class Exam2Practice1 {
  public static void main ( String [] args) {
    
    /*---------------------------------------------------------- */
    //Creating scanner and variables
    Scanner scan = new Scanner (System.in);
    double input;
    int i = 0;
    
    /*---------------------------------------------------------- */
    //Intitial input
    System.out.println( "Enter an integer over 10: " );
    input = scan.nextInt();
    
    /*---------------------------------------------------------- */
    //The type safe to make sure it is over 10
    while (input <= 10) {
      System.err.println( "NOT AN INTEGER!" );
      System.out.println( "Enter an integer over 10: " );
      input = scan.nextInt();
    }
    
    /*---------------------------------------------------------- */
    //The square rooting of the input number
    while (input > 10 ) {
      while ( input > 1.0001 ) {
        input = Math.sqrt(input);
        i++;
      }
      System.out.println( "The number: " +input+ " was square rooted " +i+ " times.");
    }   
  }//END
}//END