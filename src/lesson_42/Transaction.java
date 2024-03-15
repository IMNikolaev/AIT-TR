package lesson_42;

import java.time.Instant;

public class Transaction {
    private double amount;
    private Type type;
    private Instant timestamp;

    public Transaction(double amount, Type type, Instant timestamp) {
        this.amount = amount;
        this.type = type;
        this.timestamp = timestamp;
    }

    public double getAmount() {
        return amount;
    }

    public Type getType() {
        return type;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    // Перечисление для типа транзакции (DEBIT/CREDIT)
    public enum Type {
        DEBIT,
        CREDIT
    }
}