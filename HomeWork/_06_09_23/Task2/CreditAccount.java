package JavaProLectures.HomeWork._06_09_23.Task2;

public class CreditAccount extends Account implements Transferable{
    private double creditLimit;

    public CreditAccount(String accountNumber, double creditLimit, double accountBalance) {
        super(accountNumber, accountBalance);
        this.creditLimit = creditLimit;
    }

    @Override
    public void transfer(Account destination, double amount) {

    }
}
