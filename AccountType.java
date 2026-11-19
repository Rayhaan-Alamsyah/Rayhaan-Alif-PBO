package handson2;

public enum AccountType {
    SAVINGS("SA", 2.5),
    CREDIT("CR", 12.0),
    DEPOSIT("DP", 5.25);

    private final String code;
    private final double interestRate;

    AccountType(String code, double interestRate) {
        this.code = code;
        this.interestRate = interestRate;
    }

    public String getCode() {
        return code;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
