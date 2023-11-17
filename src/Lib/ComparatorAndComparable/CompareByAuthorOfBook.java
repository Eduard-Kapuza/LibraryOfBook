package Lib.ComparatorAndComparable;

import Lib.Book;

import java.util.Comparator;

public class CompareByAuthorOfBook implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getWriterOfBook().compareTo(o2.getWriterOfBook());
    }
}