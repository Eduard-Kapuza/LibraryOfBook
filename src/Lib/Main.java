package Lib;

import java.time.LocalDate;
import java.util.ArrayList;
import static Lib.Library.*;
import static Lib.ColorText.*;

public class Main {



    public static void main(String[] args) {

        boolean runLibrary = true;

        ArrayList<Book> list = new ArrayList<>();
        list.add(new Book("Peter Pan", "J. M. Barrie",LocalDate.of(1911,1,1)));
        list.add(new Book("Harry Potter and the chamber of secrets", "Joanne Rowling",LocalDate.of(2002,1,1)));
        list.add(new Book("Through the Looking Glass", "Lewis Carroll",LocalDate.of(1871,1,1)));

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