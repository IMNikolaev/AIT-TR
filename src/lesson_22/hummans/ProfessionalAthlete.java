package lesson_22.hummans;

public class ProfessionalAthlete extends AmateurAthlete {

    @Override
    public String run (){
        return "Run 25 km/h";
    }
    public int rest (){
        return 5;
    }

}
