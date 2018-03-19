import java.util.*;
public class ReverseString {
  public static void main (String [] args ) {
    Scanner scan = new Scanner (System.in);
    System.out.println( "Enter a sentence: " );
    String input = scan.nextLine();
    
    String reverse = "";
    /* Option 1
    for (int i = 0; i < input.length(); i++ ) 
    {
      reverse = input.charAt(i) + reverse;
    }
    */
    /* Option 2 */
    for (int i = input.length()-1; i >=0; i--)
    {
      reverse = reverse + input.charAt(i);
    }
    System.out.println("your sentence in reverse is " + reverse );
  }
}