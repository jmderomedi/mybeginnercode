/* Chapter 3 Assignments
 * 6/23/2016 */
import java.util.*;
import java.text.*;

public class ChapterThree {
  public static void main ( String [] args) {
    /*
    Scanner scan = new Scanner ( System.in);
    NumberFormat currencyFormat =  NumberFormat.getCurrencyInstance();
    
    System.out.println("Please enter a total number of quarters");
    int quarters = scan.nextInt();
    
    System.out.println("Please enter a total number of dimes");
    int dimes = scan.nextInt();
    
    System.out.println("Please enter a total number of nickels");
    int nickels = scan.nextInt();
    
    quarters = quarters * 25;
    dimes = dimes * 10;
    nickels = nickels * 5;
    
    double subtotal = quarters + dimes + nickels;
    
    subtotal /= 100;
    
    System.out.println (currencyFormat.format(subtotal));
  }//END
} //END */

Scanner scan = new Scanner (System.in);
System.out.println( "Please enter the radius of a circle");
 int rad = scan.nextInt();

double area = 3.14 * Math.pow ((double)(rad),2.0);
double circum = 3.14 * 2 * rad;

  System.out.println ("The area of the circle is " +area + " and the circumference is " +circum + "." );
  
  } //END
} //END