package lesson_24.Task_0;

public class ElectronicWallet implements PaymentSystem{

    private double balance;

    public ElectronicWallet(double balance) {
        this.balance = balance;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public void withdrawMoney(double amount) {
        System.out.println("The operation is not supported");
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
