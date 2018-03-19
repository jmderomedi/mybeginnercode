public class Dog extends Pet {
  
  public Dog() {
    super();
  }
  
  public Dog( String name, int age) {
    super(name,age);
  }
  //override of the speak method
  public void speak () {
    System.out.println("Woof!");
  }
  
}