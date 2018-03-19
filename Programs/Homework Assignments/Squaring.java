/*James Deromedi
 * MCS 141
 * 3/9/16 */
import java.util.*;

public class Squaring {
  public static void main ( String [] args ) {
    
    Scanner scan = new Scanner (System.in);
    int number = 0;
    long squared;
    int count = 1;
    
    System.out.println("Enter Integer" );
    while (!scan.hasNextInt()) {
      System.out.println("Enter Integer" );
      scan.nextLine();
    }
    /* I almost went insane trying to figure out how to not accept 1s or 0s */
    number = scan.nextInt();
    squared = number * number;
    while (squared < 1000000 ) {
      System.out.println (squared);
      squared = squared * squared;
      count++;
    }
    System.out.println (number + " exceeds 1,000,000 after " +count + " squarings." );
  }
}