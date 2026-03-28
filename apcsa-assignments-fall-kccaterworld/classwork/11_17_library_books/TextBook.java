public class TextBook extends Book {
    int edition;
    boolean isEbook;
    
    public TextBook(String title, String author, int edition, boolean isEbook) {
        super(title, author);
        this.edition = edition;
        this.isEbook = isEbook;
    }
    
    public String toString() {
        return "Textbook edition # " + edition;
    }

}
