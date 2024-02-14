package lesson_21.comp;

public class Computer {
    private Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer(Processor processor, Memory memory, Storage storage) {
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
    }
    public String infoPC (){
        StringBuilder specs = new StringBuilder();
        specs.append("Computer specs:\n");
        specs.append("Processor: ").append(processor.getBrand()).append(" ").append(processor.getModel()).append("\n");
        specs.append("Memory: ").append(memory.getBrand()).append(" ").append(memory.getModel()).append("\n");
        specs.append("Storage: ").append(storage.getBrand()).append(" ").append(storage.getModel());
        return specs.toString();
    }
}
