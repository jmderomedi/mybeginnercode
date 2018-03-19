
// ***** add your import statements here
import java.util.Scanner;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import java.util.Random;

public class PracticeMethods
{
  public static void main( String [] args )
  {
  
//*****
    // 1.  a. Create a Scanner object to read from the console
    //     b. Prompt the user for their first name
    //     c. Print a message that says hello to the user
    //     d. Print a message that says how many letters
    //               are in the user's name
    // Your code goes here
    
    Scanner scan = new Scanner (System.in);
    System.out.println ( "Hello there.\nPlease enter your first name: ");
    String name = scan.nextLine();
    System.out.println ( "Why howdy there " +name + "." );
    System.out.println ( "Did you know the length of your name is " +name.length() + " characters!" );
    
    //*****
    // 2.  a. Skip a line, then prompt the user for the year
    //            they were born.
    //     b. Calculate and print the age the user will be this year.
    //     c. Declare a constant for average life expectancy,
    //            set its value to 78.7.
    //     d. Print a message that tells the user the percentage
    //            of their expected life they've lived.
    //       Use the DecimalFormat class to format the percentage
    
    DecimalFormat agePercent = new DecimalFormat ( "#00.0#" );
    System.out.println ("");
    System.out.println ( name + " what year were you born in?: ");
    int year = scan.nextInt();
    System.out.println ( "What?!\nYou were born in " +year + "!!" );
    int age = 2016-year;
    System.out.println ( "Can you believe you are " +age + " years old!!" );
    double aveLife = 78.7;
    double percent = (age/aveLife)*100;
    System.out.println ( " I am sorry to day but you have lived " +agePercent.format(percent) + "percent"); 
    
    // 3.  a. Generate a random integer between 1 and 20
    //     b. Pop up an input dialog box and ask the user for a guess.
    //     c. Pop up an output dialog box telling the user the number
    //         and how far from the number the guess was (hint: 
    //         use Math.abs)
    
 Random random = new Random ();
 int rand = random.nextInt(20)+1;
 String guess;
 guess = JOptionPane.showInputDialog( null, "There is a random integer from 1-20\nTake a stab at what it could be: ");
 Integer number;
 number = Integer.parseInt(guess);
 JOptionPane.showMessageDialog ( null, " HAHA the random interger is " + rand + "." );
 int error = Math.abs(rand-number);
 JOptionPane.showMessageDialog ( null, " You were " +error + " numbers away" );
  }
}
