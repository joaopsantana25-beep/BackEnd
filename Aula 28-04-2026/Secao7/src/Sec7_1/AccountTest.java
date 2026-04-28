package Sec7_1;

public class AccountTest {
    public static void main(String[] args){
        SavingsAccount sa0001 = new SavingsAccount();
        sa0001.balance=1000;
        sa0001.name = "Daminen";
        sa0001.interestRate = 0.02;

        SavingsAccount sa0002 = new SavingsAccount();
        sa0002.balance=2000;
        sa0002.name = "Bill";

        sa0001.displayCustomer();
        sa0001.CheckingAccount();
        sa0001.withdraw(10);


    }
}
