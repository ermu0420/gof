import com.ermu.gof.iterator.Book;
import com.ermu.gof.iterator.BookShelf;
import com.ermu.gof.iterator.BookShelfIterator;

/**
 * @author：xusonglin
 * ===============================
 * Created with IDEA.
 * Date：2019/3/11
 * Time：12:35
 * ================================
 */
public class IteratorTest {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book("book 1"));
        bookShelf.addBook(new Book("book 2"));
        bookShelf.addBook(new Book("book 3"));
        bookShelf.addBook(new Book("book 4"));

        BookShelfIterator iterator = new BookShelfIterator(bookShelf);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
