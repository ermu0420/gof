package com.ermu.gof.iterator;

/**
 * @author：xusonglin
 * ===============================
 * Created with IDEA.
 * Date：2019/3/11
 * Time：12:23
 * ================================
 */
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        index = 0;
    }

    public boolean hasNext() {
        if (index < bookShelf.getLength()){
            return true;
        }
        return false;
    }

    public Object next() {
        Book book = bookShelf.getIndex(this.index);
        this.index ++ ;
        return book;
    }
}
