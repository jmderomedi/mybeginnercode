/* Scanner class
 * MCS 141
 * 2/4/2016 */
import java.util.Scanner;

public class Ch3Demo {
  public static void main (String [] args ) {
    /*create a scanner object and link to console */
    Scanner scan = new Scanner(System.in);
    
    /*Promted the user for input */
    System.out.printf ("Please enter your name: ");
    String name = scan.nextLine();
    
    System.out.println("Welcome " +name + "!");
    
    /* Find the minium of three numbers 
     * User needs to put in numbers */
    System.out.println ("To find the minimum of three numbers\nPlease enter an integer: ");
    int n1 = scan.nextInt();
    System.out.println ("Please enter a second integer: ");
    int n2 = scan.nextInt();
    System.out.println ("Please enter a third integer: ");
    int n3 = scan.nextInt();
    
    
    int min = Math.min(Math.min (n1,n2),n3);
    System.out.println("The minimum is " +min+ ".");
  }
  
}