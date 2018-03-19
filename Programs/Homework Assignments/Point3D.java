/*MCS 141
 * 5/4/16 May the 4th be with you
 * Point 3D Class
 James Deromedi*/

public class Point3D extends Point {
  private double z;
  
  /*--------------------------------------------- */
  public Point3D (double x, double y, double z) {
    super();
    setx(x);
    sety(y);
    setz(z);
  }
  
  /*--------------------------------------------- */
  public void setz(double z){
    this.z = z;
  }
  
  /*--------------------------------------------- */
  public double getz() {
    return this.z; 
  }
  
  /*--------------------------------------------- */
  public double distanceTo(Point3D p){
    return Math.sqrt(Math.pow(super.getx()-p.getx(),2)+Math.pow(super.gety()-p.gety(),2)+Math.pow(this.z-p.z,2)); 
  }
  
  /*--------------------------------------------- */
  public double distanceTo(Point p) {
    Point3D tem = new Point3D(p.getx(),p.gety(),0);
    return this.distanceTo(tem);
  }
  
  /*--------------------------------------------- */
  public double distanceTo() {
    Point3D tem = new Point3D(0,0,0);
    return this.distanceTo(tem);
  }
}//END