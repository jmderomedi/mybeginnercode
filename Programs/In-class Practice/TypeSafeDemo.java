/*Type safe input demo
 * 3/1/16 */
import java.util.Scanner;

public class TypeSafeDemo {
  public static void main (String [] args ) {
    
    Scanner scan = new Scanner (System.in);
    
    System.out.println( "Enter thy interger: ");
    
    while (!scan.hasNextInt() )
    {
      String garbage = scan.nextLine ();
      System.out.println( " Enter thy interger: ");
      
    }
    
    int number = scan.nextInt();
    System.out.println( "Congratulations. You enter " +number + "" );
  }
}