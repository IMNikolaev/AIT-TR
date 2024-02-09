package lesson_18;

public class Dogs {
    private String dogName;
    private int dogJumpHeight;
    private int maxDogJumpHeight;
    static int barrierHeight;
    static int dogCounts=0;
    private int countTries;
    static int dogsWhoCan = 0;


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
        if (maxDogJumpHeight > maxDogJumpHeight) return false;
        if (barrierHeight <= dogJumpHeight) return true;
        while (barrierHeight > dogJumpHeight && barrierHeight < maxDogJumpHeight+10) {
            dogTraining();
        }
        if (barrierHeight < dogJumpHeight) {dogJumpHeight = maxDogJumpHeight;}
        return true;
    }
    public String result (){
        if (barrier()) {
            return "A dog named " + dogName + " took the barrier " + countTries + " attempts";
        }
        return "A dog named " + dogName + " did not take the barrier";
    }
}
