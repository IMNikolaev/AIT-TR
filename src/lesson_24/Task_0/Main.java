package lesson_24.Task_0;

public class Main {
    public static void main(String[] args) {
        PaymentSystem bankAccount = new BankAccount(10000);
        PaymentSystem electronicWallet = new ElectronicWallet(5000);

        bankAccount.transferMoney(1000,electronicWallet);
        System.out.println(bankAccount.checkBalance());
        System.out.println(electronicWallet.checkBalance());
    }
}
