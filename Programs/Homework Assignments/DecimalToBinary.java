/*James Deromedi
 * MCS 141 
 * Binary to Decimal and reverse */

import java.util.*;

public class DecimalToBinary {
  public static void main ( String [] args ) {
    
    Scanner scan = new Scanner (System.in);
    String firstAnswer;
    int input;
    String binInput;
    boolean valid;
    String answer;
    
    //---------------------------------------------------------------------------
    do {
      String rev = "";
      String reverse= "";
      
      System.out.println( "Do you want to run the \"Binary to Decimal\" program or the \"Decimal to Binary\" program? (b/d)\nAnythting else is counted as Null" );
      firstAnswer = scan.next();
      //--------------------------------------------------------------------------
      if (firstAnswer.charAt(0)=='b' ) // if binary to decimal is selected
      {
        do { // type safe for decimal number
          System.out.println( "Please input your decimal number: (Ex. 10)" );
          //scan.nextLine();
        }
        while (!scan.hasNextInt()); // end of type safe
        
        input = scan.nextInt();
        while (input > 0)//loop to convert to binary
        {
          int rem = input % 2;
          input = input / 2; 
          rev = rev + rem;
        }
        //System.out.println(rev);
        for (int i = 0; i < rev.length(); i++ )
        {
          reverse = rev.charAt(i) +reverse;
        }
        System.out.println(reverse);
        //System.out.println(rev);
        //------------------------------------------------------------------------ 
      }
      if (firstAnswer.charAt(0)=='d') //If binary to decimal is selected
      {
        scan.nextLine();//to remove the extra from the heap
        
        do { //Type-safe to make sure its a binary number
          System.out.println( "Enter a binary number: " );
          binInput = scan.nextLine();
          valid = true;
          for ( int i=0; i <binInput.length(); i++) 
          {
            if (binInput.charAt(i)!= '0' && binInput.charAt(i) != '1' )
            {
              valid = false;
            }
          }
        } while(!valid); //end of type-safe
        //---------------------------------------------------------------------------
        int value = 0;
        for( int i = 0; i<binInput.length(); i++) //the math part to make it decimal
        {
          if (binInput.charAt(binInput.length()-1-i) == '1')
          {
            value = value +(int)Math.pow(2,i); 
          }//end of the "if" statement
        } //end of the "for" loop
        System.out.println(binInput +" in binary is " + value);
      }
      //-----------------------------------------------------------------------------
      System.out.println();
      System.out.println( "Would you like to do it again? (y/n)\nAnything else is counted as a No.");
      answer = scan.next();
    } while (answer.charAt(0)=='y');
    
  }/*end */
}/*end */