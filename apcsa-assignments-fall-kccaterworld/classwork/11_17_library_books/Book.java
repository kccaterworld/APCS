public class Book {
    String title;
    String author;
    
    public Book() {this("No", "No");}
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    public String toString() {
        return "Book: " + title;
    }
}
