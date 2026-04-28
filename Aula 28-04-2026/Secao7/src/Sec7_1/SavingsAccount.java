package Sec7_1;

public class SavingsAccount {
       public double balance;
       public double interestRate = 0.01;
       public String name;

       public void displayCustomer(){
           System.out.println("Cliente: "+name);
           System.out.println("Taxa: "+ interestRate);
       }

       public void CheckingAccount(){
           System.out.println("Balanço: "+balance);
       }

       public void deposit(double deposito){
           balance+=deposito;
           System.out.println("Depósito realizado com sucesso");
       }

       public void withdraw(double saque) {
           if (saque < 0) {
               System.out.println("O valor do saque deve ser maior que 0");
           } else {
               if (balance >= saque) {
                   balance -= saque;
                   System.out.printf("Saque realizado com sucesso\nSeu saldo atual é: R$%.2f\n",balance);

               } else {
                   System.out.println("Valor Insuficiente para Sacar");
               }
           }
       }


       public double calcInterest(){
           double interest = balance * interestRate/12;
           return interest;
       }

}






