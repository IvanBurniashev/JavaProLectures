package org.example.HomeWork._2023_09_06.Task2;

public class Main {
    public static void main(String[] args) {
        /**
         * ТЗ 2: Банковская система с различными счетами
         *
         * Абстрактный класс: Account
         * Интерфейс: Transferable
         *
         * Задача:
         * Создать банковскую систему, в которой можно создавать различные типы счетов
         * (например, счета с фиксированным балансом и счета с кредитным лимитом).
         * Реализовать абстрактный класс Account, содержащий базовую информацию о счете и методы для
         * осуществления операций. Создать интерфейс Transferable, который имеет метод transfer
         * (Account destination, double amount) для перевода средств между счетами.
         * Реализовать два класса, FixedBalanceAccount и CreditAccount, наследующихся от абстрактного класса Account.
         * Класс FixedBalanceAccount не имеет возможности использовать кредитный лимит,
         * а класс CreditAccount может использовать кредитный лимит при отрицательном балансе.
         *
         * public class Main {
         *     public static void main(String[] args) {
         *         FixedBalanceAccount fixedAccount = new FixedBalanceAccount("123456", 1000);
         *         CreditAccount creditAccount = new CreditAccount("789012", -500, 1000);
         *
         *         fixedAccount.transfer(creditAccount, 300);
         *         System.out.println("Fixed account balance: " + fixedAccount.getBalance());
         *         System.out.println("Credit account balance: " + creditAccount.getBalance());
         *     }
         * }
         */
        FixedBalanceAccount fixedAccount = new FixedBalanceAccount("123456", 1000);
        CreditAccount creditAccount = new CreditAccount("789012", -500, 1000);

        fixedAccount.transfer(creditAccount, 300);
        System.out.println("Fixed account #" + fixedAccount.getAccountNumber() + " balance: " + fixedAccount.getAccountBalance());
        System.out.println("Credit account #" + creditAccount.getAccountNumber() + " balance: " + creditAccount.getAccountBalance());
        System.out.println("=====================================================");
        creditAccount.transfer(fixedAccount, 1000);
        System.out.println("Credit account #" + creditAccount.getAccountNumber() + " balance: " + creditAccount.getAccountBalance());
        System.out.println("Fixed account #" + fixedAccount.getAccountNumber() + " balance: " + fixedAccount.getAccountBalance());
    }

}
