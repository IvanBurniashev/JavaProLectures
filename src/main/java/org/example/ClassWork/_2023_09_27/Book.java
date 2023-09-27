package org.example.ClassWork._2023_09_27;

import java.time.Year;

public class Book {
    private static int globalBookId = 1;
    private int bookId;//: Уникальный идентификатор книги.

    private String bookTitle;//: Название книги.

    private String bookAuthor;//: Автор книги.

    private BookGenre bookGenre;//: Жанр книги.

    private int bookYear;//: Год издания книги.

    private boolean bookAvailable;//: Доступность книги (true - доступна, false - не доступна).

    public Book(String bookTitle, String bookAuthor, BookGenre bookGenre, int bookYear, boolean bookAvailable) {
        this.bookId = globalBookId++;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookGenre = bookGenre;
        this.bookYear = bookYear;
        this.bookAvailable = bookAvailable;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public BookGenre getBookGenre() {
        return bookGenre;
    }

    public int getBookYear() {
        return bookYear;
    }

    public boolean getIsBookAvailable() {
        return bookAvailable;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookGenre=" + bookGenre +
                ", bookYear=" + bookYear +
                ", bookAvailable=" + bookAvailable +
                '}';
    }
}
