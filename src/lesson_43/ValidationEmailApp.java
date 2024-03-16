package lesson_43;

public class ValidationEmailApp {
    public static void main(String[] args) {
        String email = "john@email.com";

        email = "john.email.com";
        email = "4john@email.com";
        email = "john@email.co.m";

        try {
            EmailValidator.validate(email);
            System.out.println("Валидация пройден");

        } catch (EmailValidateException e) {
            System.out.println("Вы ввели не верные email");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        String password = "Qwerty123!";

        try {
            PasswordValidator.validate(password);
            System.out.println("Валидация пройдена");
        }
        catch (PasswordValidatorException e) {
            System.out.println("Вы ввели не верный password");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}