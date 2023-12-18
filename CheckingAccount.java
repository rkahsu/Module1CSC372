public class CheckingAccount extends BankAccount {
    private double interestRate;

    public CheckingAccount(String firstName, String lastName, int accountID, double interestRate) {
        super(firstName, lastName, accountID);
        this.interestRate = interestRate;
    }

    public void withdrawal(double amount) {
        if (getBalance() >= amount) {
            super.withdrawal(amount);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
            System.out.println("$30 overdraft fee");
            super.withdrawal(30.0);
        }
    }

    public void displayAccount() {
        accountSummary();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}