package Week_1.Day_2.Bank_Account;

public class BankTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        account1.deposit("checking", 1000);
        account2.deposit("savings", 2000);
        account3.deposit("checking", 1500);

        System.out.println("Balances after deposit:");
        account1.getBalance();
        account2.getBalance();
        account3.getBalance();

        account1.withdraw("checking", 500);
        account2.withdraw("savings", 1000);
        account3.withdraw("checking", 2000); 
        System.out.println("Balances after withdrawal:");
        account1.getBalance();
        account2.getBalance();
        account3.getBalance();

        System.out.println("Number of bank accounts: " + BankAccount.getAccounts());
        System.out.println("Total money in all accounts: " + BankAccount.getTotalMoney());
    }

    
}
