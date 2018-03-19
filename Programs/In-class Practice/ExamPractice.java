/*James Deromedi
 * MCS 141
 * Practice */
import javax.swing.JOptionPane;

public class ExamPractice {
  public static void main (String [] args ) {
    String fName = JOptionPane.showInputDialog(null, "Hello! What is your first name? " );
    JOptionPane.showMessageDialog( null, "Why hello " +fName );
    String lName = JOptionPane.showInputDialog( null, "" +fName + " what is your last name?" );
    
    
    int fLength = fName.length();
    int lLength = lName.length();
    
    
    if (fLength > lLength )
      JOptionPane.showMessageDialog ( null, "Your first name is longer" );
    
    else if (lLength > fLength)
      JOptionPane.showMessageDialog ( null, "Your last name is longer" );
    
    else 
    JOptionPane.showMessageDialog ( null, "Your names are the same length" );
  }
}