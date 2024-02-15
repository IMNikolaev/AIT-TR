package lesson_22.hummans;

public class AmateurAthlete extends Human {

    private final int speed = 15;
    private final int time = 10;

    @Override
    public int run (){
        return speed;
    }
    @Override
    public int rest (){
        return time;
    }

}
