package org.example.HomeWork._2023_09_06.Task2;

class FixedBalanceAccount extends Account implements Transferable {
    FixedBalanceAccount(String accountNumber, double accountBalance) {
        super(accountNumber, accountBalance);
    }

    void transfer(Account destination, double amount) {
        if (this.getAccountBalance() - amount < 0) {
            System.out.println("THE TRANSACTION FAILED!\n" +
                    "The transaction amount is greater than the account balance!");
            return;
        }
        this.transfer(destination, this, amount);
    }
}
