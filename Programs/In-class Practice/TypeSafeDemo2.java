/*Type safe input demo with data validation
 * 3/1/16 */
import java.util.Scanner;

public class TypeSafeDemo2 {
  public static void main (String [] args ) {
    
    Scanner scan = new Scanner (System.in);
    int number = 0;
    
    while (number < 1 || number > 20)      /* (! (number >= 1 && number <=20) */
    { 
      System.out.println( "Enter thy interger from 1 to 20: ");
      while (!scan.hasNextInt() )
      {
        scan = scan.close();
        //String garbage = scan.nextLine (); 
        System.out.println( "Enter thy interger from 1 to 20: ");
      }
      
      number = scan.nextInt();
    }
    System.out.println( "Congratulations. You enter " +number + "" );
  }
}