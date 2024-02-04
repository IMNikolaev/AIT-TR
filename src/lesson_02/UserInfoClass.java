package lesson_02;

public class UserInfoClass {
    private String name;
    private int age;
    private double milkPrice;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setMilkPrice(double milkPrice) {
        this.milkPrice = milkPrice;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getMilkPrice() {
        return milkPrice;
    }
    @Override
    public String toString() {
        return "Вы: " + getName() + "\nВам: " + getAge() + "\nМолоко стоит: " + getMilkPrice();
    }
}

