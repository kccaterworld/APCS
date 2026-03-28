public class Novel extends Book {
    int readingLevel;
    String genre;
    
    public Novel() {
        super();
        readingLevel = 0;
    }
    
    public Novel(String title, String author, int readingLevel, String genre) {
        super(title, author);
        this.readingLevel = readingLevel;
        this.genre = genre;
    }
    
    public String toString() {
        return genre + " Novel";
    }

}
