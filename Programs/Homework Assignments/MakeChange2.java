import javax.swing.JOptionPane;

public class MakeChange {
  public static void main (String [] args ) {
    
    /*An easter egg in the binary */
    String inputValue;
    JOptionPane.showMessageDialog (null, "01010100\n01101000\n01100101\n00100000\n01001101\n01100001\n01110100\n01110010\n01101001\n01111000\n00001010" );
    JOptionPane.showMessageDialog (null, "Never send a human to do a machine's job!\nHuman beings are a disease, a cancer of this planet. You're a plague and we are the cure." );
    inputValue = JOptionPane.showInputDialog (null, "Try entering an amount of money in dollars and cents (No dollar sign).\nEx. 1.01" );
  }
}