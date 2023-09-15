package HomeWork._06_09_23.Task2;

abstract class Account {
    private String accountNumber;
    private double accountBalance;

    Account(String accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    double getAccountBalance() {
        return accountBalance;
    }

    String getAccountNumber() {
        return accountNumber;
    }

}
