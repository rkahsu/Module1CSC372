public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Rain", "Snow", 12397);
        CheckingAccount checkingAccount = new CheckingAccount("Lin", "Smith", 14578, 1.5);

        bankAccount.deposit(1000);
        bankAccount.withdrawal(500);

        checkingAccount.deposit(2000);
        checkingAccount.withdrawal(2500);

        bankAccount.accountSummary();
        checkingAccount.displayAccount();
    }
}