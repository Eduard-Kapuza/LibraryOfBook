package Lib;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import Lib.ComparatorAndComparable.*;
import static Lib.ColorText.*;

public class Library {
    public static void getListBook(ArrayList<Book> al) {
        for (Book book : al) {
            System.out.println(ANSI_GREEN+"Book ¹" + ((al.indexOf(book)) + 1));
            System.out.print(book);
        }
    }
    public static void addBook(ArrayList<Book> aL) {

        System.out.println(ANSI_PURPLE+"Enter the book title, book author, the year of publishing(YYYY-MM-DD)"+ANSI_RESET);
        aL.add(new Book(scanString()
                , scanString()
                , LocalDate.parse(scanString())));
    }
    public static void removeBook(ArrayList<Book> al) {
        System.out.println(ANSI_PURPLE+"Enter number a book to need remove"+ANSI_RESET);
        int numberBook=scanInt();
        if (numberBook>al.size()){
            System.out.println(ANSI_RED+"This is number a book incorrect" +ANSI_RESET);
        }else {
            al.remove(numberBook - 1);
        }
    }

    public static void sorted(ArrayList<Book> al){
        System.out.println(ANSI_PURPLE+"To choice sort"+ANSI_RESET);

        System.out.println("1) Sort by name\n" +
                "2) Sort by author\n" +
                "3) Sort by date edition\n");

        switch (scanInt()) {
            case 1:
                Collections.sort(al,new CompareByNameOfBook());
                break;
            case 2:
                Collections.sort(al,new CompareByAuthorOfBook());
                break;
            case 3:
                Collections.sort(al,new CompareByDateEdition());
                break;
            default: System.out.println(ANSI_RED+"This is number incorrect" +ANSI_RESET);
        }
    }

    public static void changeOfDataAboutBook(ArrayList<Book> al){

        System.out.println(ANSI_PURPLE+"Selection a book"+ANSI_RESET);

        int numberBook=scanInt();

        System.out.println("1) Change of name a book\n" +
                        "2) Change of author a book\n" +
                        "3) Change of date edition a book\n");

        switch (scanInt()){
            case 1:
                System.out.println("Enter new name a book");
                al.get(numberBook-1).setNameOfBook(scanString());
                break;

            case 2:
                System.out.println("Enter new author a book");
                al.get(numberBook-1).setWriterOfBook(scanString());
                break;

            case 3:
                System.out.println("Enter new date edition a book");
                al.get(numberBook-1).setDateOfEdition(LocalDate.parse(scanString()));
                break;

            default: System.out.println("This is number incorrect");
        }
    }

    public static void showMenu() {
        System.out.println(ANSI_YELLOW+"--------------------------------------\n" +ANSI_RESET +
                ANSI_FAT+"1) Show list a books\n" +
                "2) Add a book\n" +
                "3) Remove a book\n" +
                "4) To sorted a books\n" +
                "5) Change of data about book\n" +
                "6) Exit\n" +
                ANSI_YELLOW+"--------------------------------------" +ANSI_RESET);
    }

    public static String scanString(){
        Scanner scanner=new Scanner(System.in);
        String temp=scanner.nextLine();
        return temp;
    }

    public static int scanInt(){
        Scanner scanner=new Scanner(System.in);
        int temp=scanner.nextInt();
        return temp;
    }
}