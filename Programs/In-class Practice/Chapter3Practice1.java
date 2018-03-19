/*  In-Class Practice on the String, DecimalFormat, and Random classes
*/
import java.util.Random;
import java.text.DecimalFormat;
public class Chapter3Practice1
{
  public static void main( String [] args )
  {
   
    //  1. Declare a String s1 using the "new" keyword.  Instantiate it to "Computer Science".
     String s1 = new String("Computer Science");
     
    //  2. Declare a String s2 without using the "new" keyword.  Instantiate it to "is amazing."
    String s2 = "is amazing";
     
    //  3. Declare a String s3.  Instantiate it to be s1 + s2.
     String s3 = s1 + s2;
     
    //  4. Output your three strings to the console.
     System.out.println (s3);
     
    //  5. Fix s3 so it outputs with better formatting and output it again to the console.
     s3 = s1 + ' ' + s2;
     System.out.println (s3);
    //  6. Uncomment the statement below.  Fix it so it prints the intended text.
    System.out.println("The sum of 3 and 7 is " + (3 + 7) + ".");
     
     
    //  7.  Output the result when the toUpper method is called on s3.
     System.out.println(s3.toUpperCase());
     
    //  8.  Instantiate a String called name to your name in the format "Last name, First name"
     String name = "Deromedi, James";
     
    //  9.  Instantiate an int as the length of "name"
     int lengthName = name.length();
     
    //  10.  Instantiate an int to be the location of the comma in "name"
     int comma = name.indexOf (',');
     
    //  11.  Write code to output your last name only
     System.out.println( name.substring(0, comma) );
     
    //  12.  Write code to output your first name only
     String firstName = name.substring ( comma + 2,lengthName);
     System.out.println(firstName);
     
    //  13.  Go back to the top of the file (before public class ... ) and import the DecimalFormat class
    //        from java.text
     
     
    //  14.  Declare a DecimalFormat object and instantiate it to a pattern that will output currency
    //       using comma separators for large values (so 12345678.9 would output as $12,345,678.90 ).
     
     DecimalFormat pattern = new DecimalFormat ("#,##0.00");
     
    //  15.  Declare a double with a value of 12345678.9
     double x = 12345678.9;
     
     
    //  16.  Output your double by formating it using the your DecimalFormat object
     System.out.println ( pattern.format(x));
     
     
    //  17.  Go back to the top of the file (before public class ... ) and import the Random class
    //        from java.util
     
     
     
    //  18.  Instantiate a new Random object called randomInt
     Random randomInt = new Random ();
     
     
    //  19.  Write code to simulate the roll of two six-sided dice and output the sum
     int die1 = randomInt.nextInt(6)+1;
     int die2 = randomInt.nextInt(6)+1;
     System.out.println((die1 + die2));
     
     
    //  20.  Write code to generate and output a random number between 1 and 1000 (inclusive)
     System.out.println (randomInt.nextInt(1000) +1);
     
         
    //  21.  Write code to generate and output a random number between 10 and 15 (inclusive)
     int start = 10, end = 15;
     System.out.println (randomInt.nextInt(end - start +1) +start );
     
    double rand= 10000*Math.random();
    System.out.println(pattern.format(rand));
  }
}
