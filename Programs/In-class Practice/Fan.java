/*If we need to import anything it would go here */

/*****
  * Fan Class, encapsulates the idea of a fan <BR>
  * Learning about JavaDoc
  * @author Deromedi, James
  *****/
public class Fan {
  private int diameter;
  private int speed;
  
  /*****
    * Default Constructor. Sets diameter to 0 and speed to 0.
    * *****/
  public Fan ()
  {
    diameter = 0;
    speed = 0;
  }
  
  /*****
    * Overloaded constructor. Allows the diameter and speed to be set
    * @param diameter the diameter of the fan
    * @param speed the speed of the fan (0, 1, 2, or 3) 
    * *****/
  public Fan(int setDiameter, int setSpeed)
  {
    diameter = setDiameter;
    speed = setSpeed;
  }
  
  /*****
    * Accessor method for diameter.
    *@return the diameter of the fan in a int 
    *****/
  public int getDiameter()
  {
    return diameter; 
  }
  
  /*****
    * Accessor method for speed.
    * @return the speed of the fan in a int.
    * *****/
  public int getSpeed()
  {
    return speed; 
  }
  
  /*****
    * Mutator method for the diameter
    * @param d the diameter
    * *****/
  public void setDiamter(int d)
  {
    if (d >=0)
      diameter = d;
    else
      System.err.println("Diameter cannot be negative. Diameter not changed.");
  }
  
  /*****
    * Mutator method for the speed
    * @param s the speed (must be 0, 1, 2, or 3)
    * *****/
  public void setSpeed(int s)
  {
    if (s>=0&&s<=3)
    {
      speed = s;
    }
    else
      System.err.println("Speed must be 0 through 3. Speed not changed.");
  }
  /*****
    * Method to increase the speed. If speed is increased past 3, sets speed to 0
    * *****/
  public void increaseSpeed()
  {
    if (speed <3)
      speed++;
    else
      speed = 0;
  }
  
  /*****
    * Method to decrease the speed. If speed is decreased past 0, sets speed to 0
    * *****/
  public void decreaseSpeed()
  {
    if (speed >0)
      speed--;
  }
  /*****
    * Method to turn fan off
    * *****/
  public void turnOff()
  {
   speed = 0; 
  }
}
