class BankAccount {
    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    public BankAccount(String firstName, String lastName, int accountID) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.accountID = accountID;
       this.balance = 0.0;
    }


    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds for withdrawal");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void accountSummary() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Account ID: " + accountID);
        System.out.println("Balance: $" + String.format("%.2f", balance));
    }

    public String getFirstName() {
        return firstName;
    }
  
    public String getLastName() {
        return lastName;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }
}

class CheckingAccount extends BankAccount {
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
