package lesson_19;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2,2));
        System.out.println(calculator.subtract(2,2));
        System.out.println(calculator.multiply(2,2));
        System.out.println(calculator.divide(2,0));
    }

}
