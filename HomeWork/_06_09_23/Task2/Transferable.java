package JavaProLectures.HomeWork._06_09_23.Task2;

public interface Transferable {
    default void transfer(Account destination, Account source, double amount) {
        source.setAccountBalance(source.getAccountBalance() - amount);
        destination.setAccountBalance(destination.getAccountBalance() + amount);
        System.out.println("THE TRANSACTION WAS SUCCESSFUL!");
    }
}
