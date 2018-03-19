public class PointClient {
  public static void main(String [] args) {
    boolean passed = true;
    
    System.out.println("Creating Point p1 with default constructor:");
    Point p1 = new Point();
    System.out.println("Location of p1 is ( " + p1.getX() + " , " + p1.getY() + " ).");
    System.out.println("Location should be ( 0.0 , 0.0 ).");
    if (p1.getX() == 0.0 && p1.getY() == 0.0)
      System.out.println("Passed.");
    else {
      System.out.println("Failed.");
      passed = false;
    }
    System.out.println();
    
    System.out.println("Creating Point p2 with coordinates ( 2.0 , 5.0 ):");
    Point p2 = new Point(2.0,5.0);
    System.out.println("Location of p2 is ( " + p2.getX() + " , " + p2.getY() + " ).");
    System.out.println("Location should be ( 2.0 , 5.0 ).");
    if (p2.getX() == 2.0 && p2.getY() == 5.0)
      System.out.println("Passed.");
    else {
      System.out.println("Failed.");
      passed = false;
    }
    System.out.println();
    
    System.out.println("Checking if p1 equals p2:");
    if (p1.equals(p2)) {
      System.out.println("p1 and p2 are equal.  (Incorrect)");
      passed = false;
    }
    else
      System.out.println("p1 and p2 are not equal.  (Correct)");
    System.out.println();
    
    System.out.println("Moving p1 to the same location as p2:");
    p1.setX(2.0);
    p1.setY(5.0);
    System.out.println("Location of p1 is ( " + p1.getX() + " , " + p1.getY() + " ).");
    System.out.println("Location should be ( 2.0 , 5.0 ).");
    if (p1.getX() == 2.0 && p1.getY() == 5.0)
      System.out.println("Passed.");
    else {
      System.out.println("Failed.");
      passed = false;
    }
    System.out.println();
    
    System.out.println("Checking if p1 equals p2:");
    if (p1.equals(p2)) {
       System.out.println("p1 and p2 are equal.  (Correct)");
    }
    else {
      System.out.println("p1 and p2 are not equal.  (Incorrect)");
      passed = false;
    }
    System.out.println();
    
    System.out.println("Moving p1 to ( 5.0 , 1.0 )");
    p1.setX(5.0);
    p1.setY(1.0);
    System.out.println("Location of p1 is ( " + p1.getX() + " , " + p1.getY() + " ).");
    System.out.println("Location should be ( 5.0 , 1.0 ).");
    if (p1.getX() == 5.0 && p1.getY() == 1.0)
      System.out.println("Passed.");
    else {
      System.out.println("Failed.");
      passed = false;
    }
    System.out.println();
    
    System.out.println("Checking distance from p1 to p2:");
    System.out.println("The distance from p1 to p2 is " + p1.distanceTo(p2) );
    System.out.println("The distance should be 5.0");
    if (Math.abs(p1.distanceTo(p2)-5.0) < .0001)
      System.out.println("Passed.");
    else {
      System.out.println("Failed.");
      passed = false;
    }
    System.out.println();
    
    System.out.println("Checking distance from p1 to the origin (no parameter passed to method):");
    System.out.println("The distance from p1 to the origin is " + p1.distanceTo() );
    System.out.println("The distance should be 5.0990195135927845");
    if (Math.abs(p1.distanceTo()-5.0990195135927845) < .0001)
      System.out.println("Passed.");
    else {
      System.out.println("Failed.");
      passed = false;
    }
    System.out.println();
    
    System.out.println("Checking the toString method on p1:");
    System.out.println(p1);
    System.out.println();
    
    if (passed)
      System.out.println("All tests passed.  Check the toString method manually.");
    else
      System.out.println("Review logs.  At least one test failed.");
  }
}