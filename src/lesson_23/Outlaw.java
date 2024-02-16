package lesson_23;

import java.util.Random;

public class Outlaw extends Melee{
    private String name;
    private int damage;
    private int hp=250;

    public Outlaw(String name) {
        this.name = name;
    }

    @Override
    public int attack() {
        Random random = new Random();
        int damage = random.nextInt(6) + 75;
        System.out.println("The outlaw strikes with force = " + damage);
        return damage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String getName() {
        return name;
    }
}
