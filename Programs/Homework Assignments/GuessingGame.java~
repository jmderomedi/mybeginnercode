/*James Deromedi
 * MCS 141
 * 3/2/16 */
import java.util.*;

public class GuessingGame {
  public static void main ( String [] args ) {
    
    Random rand = new Random ();
    int number = rand.nextInt(20) + 1;
    
    /*To see what the random number is
     System.out.println(number); */
    
    Scanner scan = new Scanner (System.in);
    System.out.println( " I have foreseen it. His guess will be his undoing.\nEnter an interger only (1-20): " );
    int guess = scan.nextInt();
    int count=1;
    
    while ( number != guess)
    {
      int length = Math.abs(guess- number);
      count++;
      switch (count)
      {
        case 1:
        case 2:
          System.out.println( "As you can see, my young apprentice, your guess has failed!\nGood! And now I sense you wish to continue your search for young Skywalker.\nTry Again:" );
          break;
        case 3:
          System.out.println(" Everything that has transpired has done so according to my design.\nOh, I'm afraid the guess shield will be quite operational when your friends arrive.\nTry Again ");
          break;
        case 4:
        case 5:
        case 6:
          System.out.println("*Emperor Palpatine voice* Do it" );
          break;
        case 7:
          System.out.print("Only together can we turn him to the Dark Side of the Force\nTry Again" );
          break;
        case 8:
        case 9:
          System.out.println("*Emperor Palpatine voice* Do it" );
          break;
        case 10:
          System.out.println(" I wonder if your feelings on this matter are clear, Lord Vader. ");
          break;
        case 11:
        case 12:
        case 13:
        case 14:
          System.out.println("*Emperor Palpatine voice* Do it" );
          break;
        case 15:
          System.out.println("Now, you will pay the price for your lack of vision!" );
          break;
        case 16:
          System.exit(0);
      }
      guess = scan.nextInt();
      int length2 = Math.abs(number-guess);
      
      
      if(guess == number){
        System.out.println("\nYou've done well, Lord Vader.");
      }
      else if (length >  length2){
        System.out.println("\nThis may smell bad, kid, but it'll keep you WARM- Han Solo" );
      }
      else if (length < length2){
        System.out.println( "Your tauntaun will FREEZE before you reach the first marker.-Echo base leader");
      }
      else if (length == length2){
        System.out.println("\nYour feeble guessing skills are no match for the power of the Dark Side." );
      }
      
    }
    System.out.println("Everything is proceeding as I have foreseen. It took " +count + " times to get it right!" );
    
    
  }
}