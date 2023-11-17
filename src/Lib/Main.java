package Lib;

import java.time.LocalDate;
import java.util.ArrayList;

import static Lib.Library.*;
import static Lib.ColorText.*;

public class Main {
//    The library v.01
//    This library can: show list, add, remove, sorted a books, change data about a books.
//    In the future I plane to add read and write in/from file/database, for data portability.
    public static void main(String[] args) {

        ArrayList<Book> list = new ArrayList<>();
        list.add(new Book("Peter Pan", "J. M. Barrie",LocalDate.of(1911,1,1)));
        list.add(new Book("Harry Potter and the chamber of secrets", "Joanne Rowling",LocalDate.of(2002,1,1)));
        list.add(new Book("Through the Looking Glass", "Lewis Carroll",LocalDate.of(1871,1,1)));
        boolean runLibrary = true;

        System.out.println(ANSI_GREEN+ANSI_FAT+"Welcome to library"+ANSI_RESET);

        while (runLibrary) {
            showMenu();

            switch (scanInt()) {
                case 1:
                    getListBook(list);
                    break;
                case 2:
                    addBook(list);
                    break;
                case 3:
                    removeBook(list);
                    break;
                case 4:
                    sorted(list);
                    break;
                case 5:
                    changeOfDataAboutBook(list);
                    break;
                case 6:
                    runLibrary=false;
                    break;
                default:
                    System.out.println(ANSI_RED+"This is number incorrect" +ANSI_RESET);
            }
        }
    }
}