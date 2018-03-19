/*MCS 141
 * 5/3/16
 * Shape Maker using Shape interface */

public class Rectangle implements ShapeInterface {
  private double base;
  private double height;
  
  public Rectangle(double base, double height) {
    this.base = Math.abs( base );
    this.height = Math.abs( height );
  }
  
  public double getArea() {
   return base * height; 
  }
  
  public double getPerimeter() {
   return 2*base + 2*height; 
  }
}