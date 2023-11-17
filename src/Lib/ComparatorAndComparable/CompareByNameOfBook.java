package Lib.ComparatorAndComparable;

import Lib.Book;

import java.util.Comparator;

public class CompareByNameOfBook implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getNameOfBook().compareTo(o2.getNameOfBook());
    }
}