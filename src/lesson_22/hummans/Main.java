package lesson_22.hummans;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        AmateurAthlete amateurAthlete = new AmateurAthlete();
        ProfessionalAthlete professionalAthlete = new ProfessionalAthlete();

        System.out.println("Speed " + human.run() + " rest Time " + human.rest());
        System.out.println("Speed " + amateurAthlete.run() + " rest Time " + amateurAthlete.rest());
        System.out.println("Speed " + professionalAthlete.run() + " rest Time " + professionalAthlete.rest());
    }
}
