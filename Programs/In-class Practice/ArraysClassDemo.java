/* Using arrays class demo
 * MCS 141
 * 4/7/16 */
import java.util.*;

public class ArraysClassDemo {
  public static void main (String [] args ) {
    
    //Creating the array
    int numbers [] = new int [20];
    for (int i = 0; i<numbers.length; i++) {
      numbers[i] = (int)(Math.random() *100) +1;
    }
    /*-----------------------------------*/
    //Print
    for (int i = 0; i<numbers.length; i++) {
      System.out.print( numbers [i] + " ");
    }
    System.out.println("");
    
    /*-----------------------------------*/
    //Sort the array
    Arrays.sort(numbers);
    
    /*-----------------------------------*/
    //Reprint the array after sorting
    for (int i = 0; i<numbers.length; i++) {
      System.out.print( numbers [i] + " ");
    }
    
  }//END
}//END