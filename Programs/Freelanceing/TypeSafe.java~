import java.util.*;

public class TypeSafe {
  public static int getInt() {
    
    Scanner scan = new Scanner (System.in);
    System.out.println( "Enter number.");
    
    while (scan.hasNextInt() ) 
    {
      /*Change for whatever you want it to do if its an integer */
      System.out.println ("good");
      break;
    }/*end of first while loop */
    
    while (!scan.hasNextInt() )
    {
      System.out.println("Not an Integer.\nPlease try again" );
      scan.nextLine();
      
      if (scan.hasNextInt())
      {
        /*Change for whatever you want it to do if its an integer */
        System.out.println ("good");
        break;
      }/*End of if statement */
    } /*End of second while loop */
    
  }
}