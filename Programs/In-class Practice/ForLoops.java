/*James Deromedi
 * MCS 141
 * 3/3/16 */

public class ForLoops {
  public static void main (String [] args ) {
    
    for (int j=0; j<20; j++)
    {
      for (int i=1; i<=20; i++ )
      {
        System.out.print ("*");
      }
      System.out.println();
    }
    /*new for */
    for (int j=0; j<20; j++)
    {
      for (int i=1; i<=j; i++ )
      {
        System.out.print ("*");
      }
      System.out.println();
    }
  }
}