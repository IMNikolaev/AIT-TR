package lesson_21.comp;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel", "Core i7");
        Memory memory = new Memory("Corsair", "16GB DDR4");
        Storage storage = new Storage("Samsung", "1TB SSD");

        Computer computer = new Computer(processor, memory, storage);
        System.out.println(computer.infoPC());
    }
}
