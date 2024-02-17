package lesson_24.Task_0;

public interface PaymentSystem {
    //void transferMoney();
    double checkBalance();
    void withdrawMoney(double amount);
    void depositMoney(double amount);
    void transferMoney (double amount, PaymentSystem recipient);
}
