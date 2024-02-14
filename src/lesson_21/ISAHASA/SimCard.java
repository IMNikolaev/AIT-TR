package lesson_21.ISAHASA;

import java.util.Random;

public class SimCard {
    private final String nameMobileSystem;
    private Phone phone;

    public String getNameMobileSystem() {
        return nameMobileSystem;
    }

    public SimCard(String nameMobileSystem) {
        this.nameMobileSystem = nameMobileSystem;
    }

    public void setPhone(Phone phone){
        this.phone = phone;
    }

    public String signal (){
        Random random = new Random();
        int randomInt = random.nextInt(6);
        switch (randomInt) {
            case (5):
                return("|||||");
            case (4):
                return("||||");
            case (3):
                return("|||");

            case (2):
                return("||");

            case (1):
                return("|");
            default:
                return("No Signal!");
        }
    }
}
