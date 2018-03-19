/*James Deromedi
 * MCS 141
 * 3/3/16 */

import java.io.*;
import java.util.*;

public class ReadFileDemo {
  public static void main (String [] args) throws IOException {
    
    File myFile = new File ("input.txt");
    Scanner fileRead = new Scanner (myFile);
    
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    double average;
    int count=0;
    int sum=0;
    
    while (fileRead.hasNextInt() )
    {
      int current = fileRead.nextInt();
      if (current >max)
        max = current;
      else if ( current < min)
        min = current;
      sum += current;
      count++;
    }
   average = (double)sum/count;
   
   System.out.println( "the max is: " +max );
      System.out.println( "the min is: " +min );
       System.out.println( "the average is: " +average );
  }
}