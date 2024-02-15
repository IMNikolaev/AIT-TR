package lesson_22.hummans;

public class ProfessionalAthlete extends AmateurAthlete {

    private final int speed = 25;
    private final int time = 5;
    public int run (){
        return speed;
    }
    public int rest (){
        return time;
    }
}
