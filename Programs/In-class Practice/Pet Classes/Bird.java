public class Bird extends Pet {
  
  public Bird() {
    super();
  }
  
  public Bird ( String name, int age) {
    super(name,age);
  }
  
  //override of the speak method
  public void speak () {
    System.out.println("Tweet!");
  }
  
}