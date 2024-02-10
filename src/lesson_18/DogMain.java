package lesson_18;

public class DogMain {
    public static void main(String[] args) {

        Dogs dog1 = new Dogs("Ball", 120);
        Dogs dog2 = new Dogs("Little", 10);
        Dogs dog3 = new Dogs("Hard", 119);
        Dogs dog4 = new Dogs("Polly", 80);
        Dogs dog5 = new Dogs("Jack", 300);
        Dogs.setBarrierHeight(200);
        System.out.println(dog1.result());
        System.out.println(dog2.result());
        System.out.println(dog3.result());
        System.out.println(dog4.result());
        System.out.println(dog5.result());
        System.out.println("Of the " + Dogs.dogCounts + " dogs, " + Dogs.getCountJumps() + " were able to take the barrier");
        System.out.println("Total number of jumps = " + Dogs.getCountJumps());
        System.out.println("The constant is the standard number of teeth in a dog = " + Dogs.getNumberOfTeethInADog());
    }
}
