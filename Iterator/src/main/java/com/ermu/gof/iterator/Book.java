package com.ermu.gof.iterator;

/**
 * @author：xusonglin
 * ===============================
 * Created with IDEA.
 * Date：2019/3/11
 * Time：12:22
 * ================================
 */
public class Book {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }
}
