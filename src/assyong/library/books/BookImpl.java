package assyong.library.books;

import java.util.*;

public class BookImpl implements BookService {

    private final Map<Integer, Book> store = new HashMap<>();
    @Override
    public void addBook(Book book) {
        if (store.containsKey(book.getBookId())){
            System.out.println("중복된 bookId");
        }
        store.put(book.getBookId(), book);
    }

    @Override
    public Book findById(Book bookId) {
        return bookId;
    }

    @Override
    public List<Book> findByTitle(String title) {
        String key = title.toLowerCase();
        List<Book> result = new ArrayList<>();
        Object[] values = store.values().toArray();
        for(int i = 0; i < values.length; i++){
            Book book = (Book) values[i];
            if (book.getTitle().toLowerCase().contains(key)){
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public void removeBook(int bookId) {
        store.remove(bookId);
    }

    @Override
    public List<Book> listAll() {
        return new ArrayList<>(store.values());
    }
}
