/* Polymorphism Demo
 * MCS 141
 * 3/28/16 */

public class PolyDemo {
  public static void main (String [] args) {
    //array to hold Pet objects
    Pet [] pets = new Pet [3];
    
    pets[0] = new Dog("f",1);
    pets[1] = new Cat("v",3);
    pets[2] = new Bird("b",4);
    
    for (int i = 0; i <pets.length; i++) {
     pets[i].speak(); 
    }
    
    for(Pet pet : pets) {
      pet.speak();
    }
     
  }
}