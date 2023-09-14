package JavaProLectures.HomeWork._06_09_23.Task2;

public class CreditAccount extends Account implements Transferable {
    private double creditLimit;

    public CreditAccount(String accountNumber, double accountBalance, double creditLimit) {
        super(accountNumber, accountBalance);
        this.creditLimit = creditLimit;
    }

    public void transfer(Account destination, double amount) {
        if (this.getAccountBalance() + this.creditLimit - amount < 0) {
            System.out.println("THE TRANSACTION FAILED! \n" +
                    "The limit of the credit limit does not allow you to perform this operation!");
            return;
        }
        Transferable.super.transfer(destination, this, amount);
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
}
