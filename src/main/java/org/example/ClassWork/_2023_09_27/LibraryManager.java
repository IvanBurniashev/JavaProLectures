package org.example.ClassWork._2023_09_27;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LibraryManager {
    private HashSet<Book> libraryCatalog;// (): Список всех книг в библиотеке.
    private HashSet<LibraryUser> libraryUsers;// (): Список всех зарегистрированных пользователей библиотеки.

    public HashSet<Book> getLibraryCatalog() {
        return libraryCatalog;
    }

    public HashSet<LibraryUser> getLibraryUsers() {
        return libraryUsers;
    }

    public List<Book> listAvailableBooksByGenre(List<Book> bookList, Enum genre) { //: Метод, который возвращает список доступных книг заданного жанра.
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getBookGenre() != genre || (bookList.get(i).getBookGenre() == genre && bookList.get(i).getIsBookAvailable() == false)) {
                bookList.remove(i);
                i--;
            }
        }
        return bookList;
    }

    public Set<String> listUserEmailsWithReservedBooks() { //: Метод, который возвращает множество адресов электронной почты пользователей, зарезервировавших книги.

        return null;
    }

    public void addBookToLibrary(Book book) { //: Метод, который добавляет новую книгу в библиотеку.
    }

    public void removeBookFromLibrary(Book book) { //: Метод, который удаляет книгу из библиотеки.

    }

    public void borrowBook(LibraryUser user, Book book) { //: Метод, который позволяет пользователю взять книгу в аренду.

    }

    public void reserveBook(LibraryUser user, Book book) { //: Метод, который позволяет пользователю зарезервировать книгу.

    }
}
