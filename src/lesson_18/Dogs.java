package lesson_18;

public class Dogs {
    final static int numberOfTeethInADog = 42;
    private String dogName;
    private int dogJumpHeight;
    private int maxDogJumpHeight;
    static int barrierHeight;
    static int dogCounts=0;
    private int countTries;
    static int dogsWhoCan = 0;
    public static int  countJumps=0;


    public static int getCountJumps() {
        return countJumps;
    }


    public int getDogCounts(){
        return dogCounts;
    }

    public void setCountTries(int countTries) {
        this.countTries = countTries;
    }


    public Dogs(String dogName, int dogJumpHeight) {
        this.dogName = dogName;
        this.dogJumpHeight = dogJumpHeight;
        maxDogJumpHeight = dogJumpHeight * 2;
        dogCounts++;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public int getDogJumpHeight() {
        return dogJumpHeight;
    }

    public void setDogJumpHeight(int dogJumpHeight) {
        this.dogJumpHeight = dogJumpHeight;
    }

    public int dogTraining () {
        if (dogJumpHeight < maxDogJumpHeight) {
            dogJumpHeight += 10;
            countJumps++;
            countTries++;
        }
        if (dogJumpHeight > maxDogJumpHeight) {
            dogJumpHeight = maxDogJumpHeight;
        }
        return dogJumpHeight;
    }
    public boolean barrier () {
        if (maxDogJumpHeight < barrierHeight) return false;
        if (barrierHeight <= dogJumpHeight) return true;
        while (barrierHeight > dogJumpHeight) {
            dogTraining();
        }
        return true;
    }
    public String result (){
        if (barrier()) {
            return "A dog named " + dogName + " took the barrier " + countTries + " attempts";
        }
        return "A dog named " + dogName + " did not take the barrier";
    }
}
