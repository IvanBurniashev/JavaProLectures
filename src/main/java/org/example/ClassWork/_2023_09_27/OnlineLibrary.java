package org.example.ClassWork._2023_09_27;

import java.util.ArrayList;
import java.util.List;

import static org.example.ClassWork._2023_09_27.BookGenre.*;

/**
 * Техническое задание (ТЗ) №3: Онлайн-библиотека
 * 1. Описание проекта
 * Цель проекта состоит в создании программы для управления каталогом книг
 * в онлайн-библиотеке. Проект будет включать минимум 3 класса с шестью полями
 * в каждом, а также класс для обработки книг с шестью методами, использующими циклы.
 * <p>
 * 2. Классы
 * 2.1. Класс "Book"
 * Поля:
 * bookId (): Уникальный идентификатор книги.
 * bookTitle (): Название книги.
 * bookAuthor (): Автор книги.
 * bookGenre (): Жанр книги.
 * bookYear (): Год издания книги.
 * bookAvailable (): Доступность книги (true - доступна, false - не доступна).
 * <p>
 * 2.2. Класс "LibraryUser"
 * Поля:
 * userId (): Уникальный идентификатор пользователя библиотеки.
 * userName (): Имя пользователя.
 * userEmail (): Электронная почта пользователя.
 * userPhone (): Номер телефона пользователя.
 * userBooksBorrowed (): Список книг, взятых пользователем в аренду.
 * userBooksReserved (): Множество книг, зарезервированных пользователем.
 * <p>
 * 2.3. Класс "LibraryManager"
 * Поля:
 * libraryCatalog (): Список всех книг в библиотеке.
 * libraryUsers (): Список всех зарегистрированных пользователей библиотеки.
 * Методы:
 * public List<Book> listAvailableBooksByGenre(String genre): Метод,
 * который возвращает список доступных книг заданного жанра.
 * public Set<String> listUserEmailsWithReservedBooks(): Метод,
 * который возвращает множество адресов электронной почты пользователей, зарезервировавших книги.
 * public void addBookToLibrary(Book book): Метод, который добавляет
 * новую книгу в библиотеку.
 * public void removeBookFromLibrary(Book book): Метод, который удаляет
 * книгу из библиотеки.
 * public void borrowBook(LibraryUser user, Book book): Метод, который
 * позволяет пользователю взять книгу в аренду.
 * public void reserveBook(LibraryUser user, Book book): Метод, который
 * позволяет пользователю зарезервировать книгу.
 * <p>
 * 3. Обработка данных
 * Книги будут добавляться, удаляться, а также бронироваться с использованием методов
 * класса "LibraryManager". Данные о книгах и
 * пользователях будут храниться в соответствующих объектах классов "Book" и "LibraryUser".
 */
public class OnlineLibrary {
    public static void main(String[] args) {
        Book book1 = new Book("Title1", "Author1", DETECTIVE, 1990, true);
        Book book2 = new Book("Title2", "Author2", SCIENCE, 1992, true);
        Book book3 = new Book("Title3", "Author3", IMAGINATIVE_LITERATURE, 1993, true);
        Book book4 = new Book("Title4", "Author4", DETECTIVE, 1994, false);
        Book book5 = new Book("Title5", "Author5", SCIENCE, 1995, false);
        Book book6 = new Book("Title6", "Author6", IMAGINATIVE_LITERATURE, 1996, false);
        Book book7 = new Book("Title7", "Author7", DETECTIVE, 1997, true);
        Book book8 = new Book("Title8", "Author8", SCIENCE, 1998, true);
        Book book9 = new Book("Title9", "Author9", IMAGINATIVE_LITERATURE, 1999, true);

        List<Book> library = new ArrayList<>();
        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        library.add(book5);
        library.add(book6);
        library.add(book7);
        library.add(book8);
        library.add(book9);

        LibraryUser user1 = new LibraryUser("Name1", "user1@mail.com", "+987654321", new ArrayList<>(), new ArrayList<>());
        LibraryUser user2 = new LibraryUser("Name2", "user2@mail.com", "+987654322", new ArrayList<>(), new ArrayList<>());
        LibraryUser user3 = new LibraryUser("Name3", "user3@mail.com", "+987654323", new ArrayList<>(), new ArrayList<>());

        LibraryManager manager1 = new LibraryManager();
        System.out.println(manager1.listAvailableBooksByGenre(library, DETECTIVE));

    }


}
