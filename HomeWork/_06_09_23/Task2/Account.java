package JavaProLectures.HomeWork._06_09_23.Task2;

public abstract class Account {
    private String accountNumber;
    private double accountBalance;

    public Account(String accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    protected void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    protected double getAccountBalance() {
        return accountBalance;
    }

    protected String getAccountNumber() {
        return accountNumber;
    }

}
