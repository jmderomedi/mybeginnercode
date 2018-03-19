/*James Deromedi
 * MCS 141
 * 3/8/16 */
public class Circle {
  
  /* instance variables */
  private double radius;
  
  /* Default Contructor */
  public Circle() {
    /* Initialize instance variables */
    radius = 0;
  }
  
  /*Overloaded constructor */
  public Circle(double radiusIn) {
    radius = radiusIn;
    setRadius(radiusIn);
  }
  
  /* Accessor Method */
  public double getRadius() {
    return radius;
  }
  
  /*Mutator Method */
  public void setRadius(double radiusIn) {
    /*This method provideds data validation */
    radius  = Math.abs(radiusIn);
    if (radiusIn < 0 )
    {
      System.err.println("Radius cannot be negative. " +radiusIn + " was changed to positive.");
    }
  }
  /*Data manipulation medthod */
  public double getArea() {
    double area = Math.PI *radius *radius;
    return area;
  }
  
  public double getCirc() {
    return 2*Math.PI*radius;
  }
}