package org.example.ClassWork._2023_09_27;

import java.util.HashSet;
import java.util.List;

public class LibraryUser {
    private static int globalUserId = 1;
    private int userId;// (): Уникальный идентификатор пользователя библиотеки.
    private String userName;// (): Имя пользователя.
    private String userEmail;// (): Электронная почта пользователя.
    private String userPhone;// (): Номер телефона пользователя.
    private List<Book> userBooksBorrowed;// (): Список книг, взятых пользователем в аренду.
    private List<Book> userBooksReserved;// (): Множество книг, зарезервированных пользователем.

    public LibraryUser(String userName, String userEmail, String userPhone, List<Book> userBooksBorrowed, List<Book> userBooksReserved) {
        this.userId = globalUserId++;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.userBooksBorrowed = userBooksBorrowed;
        this.userBooksReserved = userBooksReserved;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public List<Book> getUserBooksBorrowed() {
        return userBooksBorrowed;
    }

    public List<Book> getUserBooksReserved() {
        return userBooksReserved;
    }
}
