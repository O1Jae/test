package assyong.library.books;

public class Book {
    private final int bookId;
    private final String title;
    private final String author;
    private int bookStore;

    public Book(int bookId, String title, String author, int bookStore) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.bookStore = bookStore;
    }

    public int getBookId() {return bookId;}

    public String getTitle() {return title;}

    public String getAuthor() {return author;}

    public int getBookStore() {return bookStore;}

    public void setBookStore(int bookStore) {this.bookStore = bookStore;}
}
