/*Type safe input demo using user defined method */
import java.util.Scanner;

public class TypeSafeDemo3 {
  public static void main (String [] args ) {
    
    int number = getInt("Please enter an integer: ");
    System.out.println( "Congratulations. You enter " +number + "" );
    int number2 = getInt( "Please enter another interger" );
    System.out.println("The sum is " +(number + number2) );
  }
  
  /* New method for type safe input */
  public static int getInt (String prompt ) { /*method returns an int, requires a string */
    Scanner scan = new  Scanner (System.in);
    System.out.println( prompt );
    while (!scan.hasNextInt() ) {
      System.out.println( prompt);
      scan.nextLine();
    }
    return scan.nextInt ();
  }
} /* End of main method */

