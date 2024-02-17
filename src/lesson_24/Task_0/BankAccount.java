package lesson_24.Task_0;

public class BankAccount implements PaymentSystem{

    private double balance;


    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public double checkBalance() {
        return balance;
    }
    @Override
    public void withdrawMoney(double amount){
        if (balance >= amount){
            balance-=amount;
            System.out.println("The money has been successfully withdrawn");
            System.out.println("New balance = "+ checkBalance());
        }
        else {
            System.out.println("Insufficient funds");
        }
    }

    public void depositMoney(double amount){
        balance+=amount;
    }

    public void transferMoney (double amount, PaymentSystem recipient) {
        if (balance >= amount){
            balance-=amount;
            recipient.depositMoney(amount);
            System.out.println("The transfer has been completed");
        }
        else {
            System.out.println("Insufficient funds");
        }
    }

}
