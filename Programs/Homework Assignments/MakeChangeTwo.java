import javax.swing.JOptionPane;

public class MakeChangeTwo {
  public static void main (String [] args ) {
    
    /*An easter egg in the binary
     *Heres the binary with the spaces
     01010100 01101000 01100101 00100000 01001101 01100001 01110100 01110010 01101001 01111000 00001010 */
    String inputValue;
    JOptionPane.showMessageDialog (null, "01010100\n01101000\n01100101\n00100000\n01001101\n01100001\n01110100\n01110010\n01101001\n01111000\n00001010" );
    JOptionPane.showMessageDialog (null, "Never send a human to do a machine's job!\nHuman beings are a disease, a cancer of this planet. You're a plague and we are the cure." );
    
    inputValue = JOptionPane.showInputDialog (null, "Try entering an amount of money in dollars and cents (With dollar sign in front or in back).\nEx. $1.01" );
    JOptionPane.showMessageDialog (null, "See you can not help yourself.\n" +inputValue + " \nTemporary constructs of a feeble human intellect trying desperately to justify an existence that is without meaning or purpose." );
    
    /*Removing the first character or the "$" from the input */
    int money = inputValue.indexOf("$");
    StringBuilder removal = new StringBuilder(inputValue);
    removal.deleteCharAt(money);
    
    /*I would have used my old code for this part but I loved the way you did it on the student work in blackboard */
    double value = Double.parseDouble( removal.toString());
    int total = (int)(value*100);
    int quarters = total / 25;
    int dimes =  total % 25 / 10;
    int nickels =  total %25 % 10 / 5;
    int pennies = total %25 % 10 %5 /1;
    
    JOptionPane.showMessageDialog (null, "Why, Mr. Anderson? Why? Why do you persist?" );
    JOptionPane.showMessageDialog (null, "Here is your outcome Mr. Anderson." + "\n" +inputValue + " can be made using:\n" + quarters +" Quarters\n" +dimes + " Dimes\n" + nickels + " Nickels\n" +pennies + " Pennies\n");
    
    JOptionPane.showMessageDialog (null, "You hear that Mr. Anderson?... That is the sound of inevitability... It is the sound of your death... Goodbye, Mr. Anderson... " );
    System.out.println ("My name... is Neo...." ); 
}
}