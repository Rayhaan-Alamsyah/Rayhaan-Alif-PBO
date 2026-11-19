package handson1;

public class Account {
    private final String accountNumber;
    private final AccountType type;

    public Account(String accountNumber, AccountType type) {
        this.accountNumber = accountNumber;
        this.type = type;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public AccountType getType() {
        return type;
    }

    public void displayInfo() {
        System.out.println("No. Rekening: " + accountNumber + " | Tipe: " + type.toString());
    }
}
