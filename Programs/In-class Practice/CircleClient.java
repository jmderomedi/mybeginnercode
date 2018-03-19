public class CircleClient {
  public static void main( String [] args ) {
    Circle c1 = new Circle();
    Circle c2 = new Circle(5.0);
    
    double r1 = c1.getRadius();
    double r2 = c2.getRadius();
    
    System.out.println("The radius of c1 is " +r1 + ".");
    System.out.println("The radius of c2 is " +r2 + ".");
  }
}