package lesson_42;

import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // TASK 0

        String text = "Hello, world and good! afternoon";
        int countLetters = countLetters(text);
        System.out.println("Task 1");
        System.out.println("countLetters: " + countLetters);
        System.out.println("------------------------------");

        // TASK 1
        System.out.println("Task 1");
        System.out.println(task1(group1()));
        System.out.println("------------------------------");

        // TASK 2

        System.out.println("Task 2");
        task2(group2());
        System.out.println("------------------------------");

        // TASK 3
        System.out.println("Task 3");
        task3(group1());
        System.out.println("------------------------------");


    }

    private static Map<String, Double> task3(List<Employee> employees) {
        Map<String, Double> averageSalaryByDepartment = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));
        Map.Entry<String, Double> maxDepartment = averageSalaryByDepartment.entrySet().stream()
                .max(Comparator.comparingDouble(Map.Entry::getValue))
                .orElseThrow();

        System.out.println("Отдел с максимальной средней зарплатой: " + maxDepartment.getKey());
        System.out.println("Средняя зарплата в этом отделе: " + maxDepartment.getValue());

        return null;
    }

    private static void task2 (List<Transaction> transactions) {
        double sumDebit = transactions.stream()
                .filter(transaction -> transaction.getType() == Transaction.Type.DEBIT)
                .mapToDouble(Transaction::getAmount).sum();
        System.out.println("Debit sum " + sumDebit);
        double sumCredit = transactions.stream()
                .filter(transaction -> transaction.getType() == Transaction.Type.CREDIT)
                .mapToDouble(Transaction::getAmount).sum();
        System.out.println("Credit sum " + sumCredit);

        OptionalDouble min = transactions.stream().mapToDouble(transaction -> transaction.getAmount()).min();
        System.out.println("Min " + min.orElseThrow());
    }

    private static Map<String, List<Employee>>  task1(List<Employee> employees) {
        Map<String, List<Employee>> map1  = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        return map1;
    }

    private static int countLetters(String text) {
        return Arrays.stream(text.split(" "))
                .filter(string -> string.length()>4)
                .mapToInt(word -> word.replaceAll("[^a-zA-Zа-яА-Я]", "").length())
                .reduce(0,Integer::sum);
    }
    private static List<Employee> group1() {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Petr", 2500, 25, "developer", "IT"),
                new Employee("Silvia", 1500, 22, "trainee", "IT"),
                new Employee("Stefan", 2500, 30, "PM", "IT"),
                new Employee("Olivia", 2700, 25, "manager", "Management"),
                new Employee("Sebastian", 3500, 25, "chef", "Management"),
                new Employee("Hanna", 1300, 25, "Cleaner", "Cleaning"),
                new Employee("John", 3200, 19, "chef", "IT")
        ));
        return employees;
    }
    private static List<Transaction> group2() {
    List<Transaction> transactions = List.of(
            new Transaction(100.0, Transaction.Type.DEBIT, Instant.now()),
            new Transaction(200.0, Transaction.Type.CREDIT, Instant.now()),
            new Transaction(150.0, Transaction.Type.DEBIT, Instant.now()),
            new Transaction(300.0, Transaction.Type.CREDIT, Instant.now())
    );
        return transactions;
    }
}
