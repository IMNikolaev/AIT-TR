package lesson_23;

import java.util.Random;

public class Warrior extends Melee{
    private String name;
    private int damage;
    private int hp=375;

    public Warrior(String name) {
        this.name = name;
    }


    @Override
    public int attack() {
        Random random = new Random();
        int damage = random.nextInt(6) + 50;
        System.out.println("The warrior strikes with force = " + damage);
        return damage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }
}
