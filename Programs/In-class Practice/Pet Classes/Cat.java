public class Cat extends Pet {
  
  public Cat() {
    super();
  }
  
  public Cat( String name, int age) {
    super(name,age);
  }
  
  //override of the speak method
  public void speak () {
    System.out.println("Meow!");
  }
  
}