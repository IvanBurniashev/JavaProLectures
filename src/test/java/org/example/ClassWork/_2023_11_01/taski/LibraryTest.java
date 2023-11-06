package org.example.ClassWork._2023_11_01.taski;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    private final Library library = new Library();

    private Book createBook() {
        Author author = new Author("Vasily", 40);
        return new Book("Anna Karenina Pro", author, "300523", 1_000);
    }

    @BeforeEach
    void setUp() {
        library.addBook(createBook());
        library.addBook(Mockito.mock(Book.class));
        library.addBook(Mockito.mock(Book.class));
    }

    @Test
    void addBookPositiveAddBookTest() {
        Book book = createBook();
        library.addBook(book);
        Assertions.assertEquals(3, library.getBooks().size());
    }

    @Test
    void addBookIllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> library.addBook(null));
    }

    @Test
    void addBookPositiveAddAuthorTest() {
        Book book = createBook();
        library.addBook(book);
        System.out.println(library.getAuthors());
        Assertions.assertEquals(1, library.getAuthors().size());
    }





}