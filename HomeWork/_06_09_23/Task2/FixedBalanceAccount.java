package JavaProLectures.HomeWork._06_09_23.Task2;

public class FixedBalanceAccount extends Account implements Transferable {
    public FixedBalanceAccount(String accountNumber, double accountBalance) {
        super(accountNumber, accountBalance);
    }

    public void transfer(Account destination, double amount) {
        if (this.getAccountBalance() - amount < 0) {
            System.out.println("THE TRANSACTION FAILED!\n" +
                    "The transaction amount is greater than the account balance!");
            return;
        }
        Transferable.super.transfer(destination, this, amount);
    }
}
