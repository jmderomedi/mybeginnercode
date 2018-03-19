/*James Deromedi
 * MCS 141
 * "A Graphical Application"
 * 2/11/16 */
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Color;
import java.awt.Font;

public class GraphicalApp extends JFrame{
  public void paint( Graphics g ){
  super.paint(g);
  
  g.setColor (Color.RED);
  g.fillRect (425,350,150,400);
  
  Polygon polly = new Polygon ();
  polly.addPoint (425,750);
  polly.addPoint (575,750);
  polly.addPoint (675,850);
  polly.addPoint (550,790);
  polly.addPoint (500,850);
  polly.addPoint (450,790);
  polly.addPoint (325,850);
  g.fillPolygon (polly);
  
  Polygon tri = new Polygon ();
  tri.addPoint (425,350);
  tri.addPoint (575,350);
  tri.addPoint (500,200);
  g.fillPolygon (tri);
  
  g.setColor (Color.BLACK);
  g.fillRect (710,350,150,500);
  g.fillRect (575,375,150, 50);
  
  Color window = new Color (180,255,255);
  g.setColor(window);
  g.fillOval (450,400,100,100);
  g.fillOval (450,550,100,100);
  
  
  g.setColor (Color.ORANGE);
  g.drawLine (450,800,440,825);
  g.drawLine (440,825,460,850);
  g.drawLine (460,850,440,875);
  
  g.drawLine (550,800,560,825);
  g.drawLine (560,825,540,850);
  g.drawLine (540,850,560,875);
  
  g.setColor (Color.BLACK);
  g.setFont(new Font("TimesRoman", Font.PLAIN, 20)); 
  g.drawString ( "BLAST OFF!!", 735, 325); 
  
  }
    public static void main (String [] args ) {
    GraphicalApp window = new GraphicalApp ();
    window.setSize(1000,1000);
    window.setVisible( true);
    
    
  }
}