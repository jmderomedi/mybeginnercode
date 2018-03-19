import java.util.Arrays;
 
public class BookList {
  private Book [] list;
  private int lastIndex;
   
  public BookList() {
    list = new Book [10];
    lastIndex = -1;
  }
   
  public void resize() {
    Book [] temp = new Book[list.length+10];
    for (int i = 0; i<list.length; i++) {
      temp[i] = list[i];
    }
    list = temp;
    temp = null;
  }
   
  public void add(Book b) {
    lastIndex++;
    if (lastIndex >= list.length)
      resize();
    list[lastIndex] = b;
  }
   
  public void add(String title, String author) {
    Book b = new Book(title, author);
    add(b);
  }
   
  public void sort() {
    Arrays.sort(list,0,lastIndex+1);
  }
   
  public String toString() {
    String output = "";
    for (int i = 0; i<= lastIndex; i++) {
      output = output + list[i] + "\n";
    }
    return output;
  }
   
}
