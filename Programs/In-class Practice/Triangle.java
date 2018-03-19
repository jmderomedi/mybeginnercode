/*MCS 141
 * 5/3/16
 * Triangle class that implements shapeinterface */

public class Triangle implements ShapeInterface {
  private double s1;
  private double s2;
  private double s3;
 
  public Triangle (double s1, double s2, double s3) {
   this.s1 = Math.abs(s1);
   this.s2 = Math.abs(s2);
   this.s3 = Math.abs(s3);
  }
  
  public double getPerimeter() {
   return s1 + s2 +s3; 
  }
  
  public double getArea() {
   double s = (s1+s2+s3)/2;
   return Math.sqrt(s*((s-s1)*(s-s2)*(s-s3)));
   
  }
}