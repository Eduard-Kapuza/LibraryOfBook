package Lib;

import java.time.LocalDate;
import static Lib.ColorText.*;

public class Book {
    private String nameOfBook;
    private String writerOfBook;
    private LocalDate dateOfEdition;

    public Book(String nameOfBook, String writerOfBook, LocalDate dateOfEdition) {
        this.nameOfBook = nameOfBook;
        this.writerOfBook = writerOfBook;
        this.dateOfEdition = dateOfEdition;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public void setWriterOfBook(String writerOfBook) {
        this.writerOfBook = writerOfBook;
    }

    public void setDateOfEdition(LocalDate dateOfEdition) {
        this.dateOfEdition = dateOfEdition;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public String getWriterOfBook() {
        return writerOfBook;
    }

    public LocalDate getDateOfEdition() {
        return dateOfEdition;
    }

    @Override
    public String toString() {
        return  ANSI_TILTED+ANSI_FAT+"\t\tThe book title: "+ANSI_CYAN +nameOfBook+ANSI_GREEN + "; \n" +
                                     "\t\tBook author: "+ANSI_CYAN +writerOfBook+ANSI_GREEN + "; \n" +
                                     "\t\tThe year of publishing: "+ANSI_CYAN +dateOfEdition+ANSI_GREEN+ "; \n"+ANSI_RESET;
    }
}