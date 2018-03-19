public abstract class Pet {
  private String name;
  private int age;
  
  //Default Constructor
  public Pet() {
    name = "unknown";
    age = -1;
  }
  
  //Overloaded
  public Pet(String name, int age) {
    this.name = name;
    this.age = age;
  }
  
  //GetAge
  public int getAge() {
    return age;
  }
  
  public String getName() {
    return name;
  }
  
  public void setAge(int age) {
    this.age = age;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  //Abstract method
  public abstract void speak(); //No brackets
  //No method body
      
}