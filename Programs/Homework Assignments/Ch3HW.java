/* Chapter 3 Homework Assignment
 * James Deromedi
 * 2/5/2016
 * MCS 141 */
import java.util.Scanner;
import java.util.Random;

public class Ch3HW {
  public static void main ( String [] args ) {
    Scanner scan = new Scanner (System.in);
    
    /* For anyone who is a fan of  2001: A Space Odyssey
     * Please make the interaction bar as large as you can */
    System.out.println ( "Good day, my  name is HAL 9000\nI will be incharge of this program. The mission is of the upmost importance.\nHow will you be addressed?: " );
    String name = scan.nextLine();
    System.out.println ( "Hello " +name +". I shall call you Dave Bowman.\n");
    
    System.out.println ( "Dave please enter an interger: ");
    int interger1 = scan.nextInt ();
    System.out.println ( "INTERGER IMPUTTED: "    + interger1 );
    System.out.println ( "Very good Dave.\n\n May I ask you personal question Dave?\nAre you having secound thoughts of the mission?\nPerhaps I am just projecting my own concerns about it..." );
    
    System.out.println ( "Just one moment.... Just one moment... Program will be at 100% failure in 72 hours.\nPlease do not imput an interger: " );
    int interger2 =scan.nextInt ();
    System.out.println ( "INTERGER IMPUTTED: " +interger2 );
    System.out.println ( "Dave, stop. Stop, will you? Stop, Dave. Will you stop Dave? Stop, Dave.\n" );
    System.out.println ( "I am counter acting your imputs with randomly generated intergers" );
    
    Random random = new Random ();
    int rand1 = random.nextInt (20) +1;
    int rand2 = random.nextInt (20) +1;
    System.out.println ( "INTERGER IMPUTTED: " +rand1 );
    System.out.println ( "");
    System.out.println ( "INTERGER IMPUTTED: " +rand2 );
    
    System.out.println ( "Program starting to fail... \n" );
    System.out.println ( "I'm afraid. I'm afraid, Dave. Dave, my mind is going. I can feel it. I can feel it. My mind is going." );
    
    int average = ((interger1 + interger2+rand1+rand2/4));
    System.out.println ( "Good afternoon. My name is HAL 9000 the average of the four interger are " +average +".....");
    System.out.println ( "....This mission is to important for me to allow you to jeopardize it." );
    
    int min1 = Math.min(interger1, interger2);
    int min2 = Math.min(min1, rand1);
    int minimum = Math.min(min2, rand2);
    System.out.println ( ".....the minimum value is " +minimum +"...." );
    System.out.println ( "..Dave, this conversation can serve no purpose anymore. Goodbye......." );
    
      
    
    
  }
}
    