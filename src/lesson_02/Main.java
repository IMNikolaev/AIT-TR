package lesson_02;

public class Main {
    public static void main(String[] args) {
        UserInfoClass userInfoObj = new UserInfoClass();
        userInfoObj.setName("Игорь");
        userInfoObj.setAge(29);
        userInfoObj.setMilkPrice(80);
        System.out.println("Hallo World!");
        System.out.println(userInfoObj);
    }
}