package org.example.HomeWork._06_09_23.Task2;

class CreditAccount extends Account implements Transferable {
    private double creditLimit;

    CreditAccount(String accountNumber, double accountBalance, double creditLimit) {
        super(accountNumber, accountBalance);
        this.creditLimit = creditLimit;
    }

    void transfer(Account destination, double amount) {
        if (this.getAccountBalance() + this.creditLimit - amount < 0) {
            System.out.println("THE TRANSACTION FAILED! \n" +
                    "The limit of the credit limit does not allow you to perform this operation!");
            return;
        }
        this.transfer(destination, this, amount);
    }
}
