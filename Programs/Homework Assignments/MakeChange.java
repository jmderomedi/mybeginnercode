/* James Deromedi
 * MCS 141
 * 1/28/16
 * MakeChange */

public class MakeChange
{
  public static void main (String [] args )
  {
   /*Calculating how many coins of change there are in $1.42
    * 5 quarters
    * 1 dime
    * 1 nickel
    * 2 pennies */
    
    int quarters = 142  /25;
    int remaining1 = 142 % 25;
    int dimes = remaining1 / 10;
    int remaining2 = remaining1 % 10;
    int nickels = remaining2 / 5;
    int remaining3 = remaining2 % 5;
    int pennies = remaining3 / 1;
    int total = quarters + dimes + nickels + pennies;
    
    System.out.println ("There are " +quarters + " quarters in change." );
    System.out.println ("There are " +dimes + " dimes in change." );
    System.out.println ("There are " +nickels + " nickels in change." );
    System.out.println ("There are " +pennies + " pennies in change." );
    System.out.println ("There are total of " +total + " coins in change." );
  }
}
      