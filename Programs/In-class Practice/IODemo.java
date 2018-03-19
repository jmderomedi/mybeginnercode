/* Input/Output Demo with JOption Pane
 * James Deromedi
 * MCS 141 */
import javax.swing.JOptionPane;

public class IODemo {
  public static void main ( String [] args ) {
    /* prompt user for name using imput dialog */
    String name;
    name = JOptionPane.showInputDialog( null, "Please enter your name: ");
    JOptionPane.showMessageDialog(  null, "Hello there " +name + "!" );
    
    /*prompt user for an interger */
    String input;
    input = JOptionPane.showInputDialog( null, "Please enter an intger " +name + "." );
    Integer number;
    number = Integer.parseInt(input);
    JOptionPane.showMessageDialog ( null, "The square root of " +number + " is " + Math.sqrt (number) + "." );
    
  }
}