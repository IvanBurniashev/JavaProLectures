package org.example.HomeWork._2023_09_06.Task2;

interface Transferable {
    default void transfer(Account destination, Account source, double amount) {
        source.setAccountBalance(source.getAccountBalance() - amount);
        destination.setAccountBalance(destination.getAccountBalance() + amount);
        System.out.println("THE TRANSACTION WAS SUCCESSFUL!");
    }
}
