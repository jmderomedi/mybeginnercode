public class BookListTest {
  public static void main(String [] args) {
    BookList store = new BookList();
    store.add("Hobbit, The", "Tolkien, J.R.R.");
    store.add("Return of the King", "Tolkien, J.R.R.");
    store.add("Fellowship of the Ring", "Tolkien, J.R.R.");
    store.add("Two Towers, The", "Tolkien, J.R.R.");
    store.add("Chronicles of Narnia, The", "Lewis, C.S.");
    store.add("Elements", "Euclid");
     
    System.out.println("Before sorting:");
    System.out.print(store);
    System.out.println();
    store.sort();
     
    System.out.println("After sorting:");
    System.out.print(store);
  }
}
