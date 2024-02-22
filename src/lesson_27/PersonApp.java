package lesson_27;/*
@date 21.02.2024
@author Sergey Bugaienko
*/

public class PersonApp {

    public static void main(String[] args) {
        Person person = new Person("email", "password");
        System.out.println(person);
        System.out.println(person.isPassword("AbCdEfG1"));
    }


    // JUnit Jupiter/ TestNG



}