/*James Deromedi
 * MCS 141
 * WaterBottle Class */

public class WaterBottle {
  
  //Variables
  private double capacity;
  private double current;
  
  /*------------------------------------------------ */
  //Default Constructor
  public WaterBottle() {
    capacity = 16.0;
    current = 0.0;
  }
  
  /*------------------------------------------------ */
  //Overload Constructor
  public WaterBottle ( double newCapacity, double newCurrent) {
    capacity = newCapacity;
    current = newCurrent;
  }
  
  /*------------------------------------------------ */
  //Get Capacity
  public double getCapacity() {
    return capacity;
  }
  
  /*------------------------------------------------ */
  //Get Current
  public double getCurrent() {
    return current;
  }
  
  /*------------------------------------------------ */
  //Set Capacity
  public void setCapacity( double newCap) {
    capacity = newCap;
  }
  
  /*------------------------------------------------ */
  //Drink Method
  public void drink ( double thirst) {
    current -= thirst;
    if (current <= 0 ) {
      current = 0; 
    }
  }
  
  /*------------------------------------------------ */
  //Fill Method
  public void fill () {
    current = capacity;
  }
  
}//END