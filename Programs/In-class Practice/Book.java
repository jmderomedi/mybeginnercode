public class Book implements Comparable <Book> {
  private String title;
  private String author;
  
  public Book () {
    title = "unknown";
    author = "unknown";
  }
  
  public Book (String titleIn, String authorIn) {
    setTitle(titleIn);
    setAuthor(authorIn);
  }
  
  public String getTitle() {
    return title;
  }
  
  public String getAuthor() {
    return author;
  }
  
  public void setTitle(String newTitle) {
    title = newTitle;
  }
  
  public void setAuthor(String newAuthor) {
    author = newAuthor;
  }
  
  public String toString() {
    return title + " by " + author;
  }
  
  //implemtation of compareTo methof
  public int compareTo(Book b) {
    if (this.author.compareTo(b.author) == 0) { // if same author
      return this.title.compareTo(b.title); //return int based on title
    }
    else //if different authors
      return this.author.compareTo(b.author); //reutn int based on author
  }
}
