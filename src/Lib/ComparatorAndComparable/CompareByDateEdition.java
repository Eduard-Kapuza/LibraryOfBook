package Lib.ComparatorAndComparable;

import Lib.Book;

import java.util.Comparator;

public class CompareByDateEdition implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getDateOfEdition().compareTo(o2.getDateOfEdition());
    }
}