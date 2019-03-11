package com.ermu.gof.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author：xusonglin
 * ===============================
 * Created with IDEA.
 * Date：2019/3/11
 * Time：12:22
 * ================================
 */
public class BookShelf implements  Aggregate{
    private List<Book> books;

    public BookShelf() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book book){
        if(null == books){
            books = new ArrayList<Book>();
        }
        books.add(book);
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

    public int getLength(){
        if (null == books){
            return 0;
        }
        return books.size();
    }

    public Book getIndex(int index){
        return books.get(index);
    }
}
