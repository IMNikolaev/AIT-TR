package lesson_22.hummans;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        AmateurAthlete amateurAthlete = new AmateurAthlete();
        ProfessionalAthlete professionalAthlete = new ProfessionalAthlete();

        System.out.println(human.run() + " " + human.rest());
        System.out.println(amateurAthlete.run() + " " + amateurAthlete.rest());
        System.out.println(professionalAthlete.run() + " " + professionalAthlete.rest());
    }
}
