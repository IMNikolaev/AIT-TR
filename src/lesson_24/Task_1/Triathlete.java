package lesson_24.Task_1;

public class Triathlete implements Swimmer,Runner{


    private int status=0;


    @Override
    public void run() {
        if (status == 1){stopRun();}
        if (status == 2){stopSwim();}
        status =1;
        System.out.println("Start Run");
    }


    private void stopRun() {
        System.out.println("Stop Run");
        status=0;
    }

    @Override
    public void swim() {
        if (status == 1){stopRun();}
        if (status == 2){stopSwim();}
        status =2;
        System.out.println("Start Swim");
    }


    private void stopSwim() {
        System.out.println("Stop Swim");
        status=0;
    }
    public void stop(){
        if (status == 1){stopRun();}
        if (status == 2){stopSwim();}
    }
}
