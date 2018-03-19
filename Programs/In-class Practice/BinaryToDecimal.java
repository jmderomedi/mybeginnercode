/*James Deromedi
 * MCS 141
 * 3/3/16 */
import java.util.*;

public class BinaryToDecimal 
{
  public static void main (String [] args )
  {
    Scanner scan = new Scanner(System.in);
    String input;
    boolean valid;
    do 
    {
      System.out.println( "Enter a binary number: " );
      input = scan.nextLine();
      valid = true;
      for ( int i=0; i <input.length(); i++) 
      {
        if (input.charAt(i)!= '0' && input.charAt(i) != '1' )
        {
          valid = false;
        }
      }
    } while(!valid);
    //System.out.println(input);
    
    int value = 0;
    for( int i = 0; i<input.length(); i++)
    {
      if(input.charAt(input.length()-1-i) == '1')
      {
        value = value +(int)Math.pow(2,i); 
      }
      
    }
    System.out.println(input +" binary " + value);
  }
}