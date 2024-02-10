package lesson_18;

public class Dogs {
    private final static int numberOfTeethInADog = 42;
    private String dogName;
    private int dogJumpHeight;
    private int maxDogJumpHeight;
    private static int barrierHeight;
    static int dogCounts=0;
    private int countTries;
    static int dogsWhoCan = 0;
    private static int  countJumps=0;

    public static int getNumberOfTeethInADog(){
        return numberOfTeethInADog;
    }

    public static int getBarrierHeight() {
        return barrierHeight;
    }

    public static void setBarrierHeight(int barrierHeight) {
        Dogs.barrierHeight = barrierHeight;
    }

    public static int getCountJumps() {
        return countJumps;
    }

    public static void setCountJumps(int countJumps) {
        Dogs.countJumps = countJumps;
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
            countTries++;
        }
        if (dogJumpHeight > maxDogJumpHeight) {
            dogJumpHeight = maxDogJumpHeight;
        }
        return dogJumpHeight;
    }
    public boolean barrier () {
        int CountJumps = getCountJumps();
        if (maxDogJumpHeight < barrierHeight) return false;
        if (barrierHeight <= dogJumpHeight)
        {
            CountJumps++;
            setCountJumps(CountJumps);
            return true;}
        while (barrierHeight > dogJumpHeight) {
            dogTraining();
        }
        CountJumps++;
        setCountJumps(CountJumps);
        return true;
    }
    public String result (){
        if (barrier()) {
            return "A dog named " + dogName + " took the barrier " + countTries + " attempts";
        }
        return "A dog named " + dogName + " did not take the barrier";
    }
}
