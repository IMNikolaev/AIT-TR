package lesson_23;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("WarriorRin");
        Outlaw outlaw = new Outlaw("ThiefSue");

        System.out.println("FIGHT");
        fight(warrior,outlaw);

    }

    private static void fight(Melee gamer1, Melee gamer2) {
        while (gamer1.getHp() > 0 || gamer2.getHp() > 0) {
            gamer2.setHp(gamer2.getHp() - gamer1.attack());
            gamer1.setHp(gamer1.getHp() - gamer2.attack());
        }

        if (gamer1.getHp() > 0) System.out.println(gamer1.getName() + " WIN");
        if (gamer2.getHp() > 0) System.out.println(gamer2.getName() + " WIN");
        else System.out.println("Draw");
    }
}
