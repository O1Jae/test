package assyong.library.books;

import java.util.List;

public interface BookService {
    void addBook(Book book);
    Book findById(Book id);
    List<Book> findByTitle(String title);
    void removeBook(int bookId);
    //void changeStock(int bookId,int delta);//재고는 나중에
    List<Book> listAll();
}
