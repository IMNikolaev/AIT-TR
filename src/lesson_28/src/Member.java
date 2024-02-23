package lesson_28.src;/*
@date 21.02.2024
@author Sergey Bugaienko
*/

public class Member {
    private String email;
    private String password;

    public Member(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        }
    }

    // jo22.hn@testn.et
    /*
    1. done - @ should be present and there should only be one
    2. Done - the dot after the dog
    3. done - The dot can't be right after the dog
    4. done - There must be at least two characters after the last period
    5. done - Only alphabet characters, numbers, '-', '_', '.', '@' can be present.
    6. done - The first character should be - alphabetical
      = Place for @ - though b one character before the dog

     */
    private boolean isEmailValid(String email) {

        // проверяем что пришел не null и не пустая строка
        if (email == null || email.isEmpty()) return false;

        // tttt@trtrtr.n.et
        // 1. @ |
        int indexAt = email.indexOf('@');
        if (indexAt <= 0 || indexAt != email.lastIndexOf('@')) return false;

        // 2. Должна быть точка после @

        // Method overload - starts after with the index (in this case, the sign index @
        int indexFirstDotAfterAt = email.indexOf('.', indexAt);
        if (indexFirstDotAfterAt == -1 || indexFirstDotAfterAt == indexAt + 1) return false;

        // 3. LastDot
        if (email.lastIndexOf('.') >= email.length() - 2) return false;

        // true - если первый символ является буквой алфавита
        boolean isCharAlphabetic = Character.isAlphabetic(email.charAt(0));
        if (!isCharAlphabetic) return false;


        // 5. Only alphabet characters, numbers, '-', '_', '.', '@' can only be present.

        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);

            //true, if the symbol satisfies at least one of the criteria.
            boolean isCharValid = (
                    Character.isAlphabetic(c)
                            || Character.isDigit(c)
                            || c == '-'
                            || c == '_'
                            || c == '.'
                            || c == '@'
            );

            if (!isCharValid) return false;

        }

        // All checks passed, nowhere did the method return false ->
        return true;
    }

    public String getPassword() {
        return password;
    }



    public void setPassword(String password) {
        if (isPasswordValid(password)) {
            this.password = password;
        }
    }



     /* Требования к валидности пароля
    1. done - длина пароля >= 8
    2. мин 1 маленькая буква
    3. мин 1 большая буква
    4. мин 1 цифра
    5. мин 1 спец символ ("!%$@&*()[]")
     */

    private boolean isPasswordValid(String password) {
        if (password == null || password.isEmpty()) return false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        String specialChars = "!%$@&*()[]";
        char[] passwordChars = password.toCharArray();
        for (int i = 0; i < passwordChars.length; i++) {
            char ch = passwordChars[i];
            if(Character.isUpperCase(ch)){
                hasUpperCase = true;
            }
            else if(Character.isLowerCase(ch)){
                hasLowerCase = true;
            }
            else if(Character.isDigit(ch)){
                hasDigit = true;
            }
            else if (specialChars.indexOf(ch) != -1){
                hasSpecialChar = true;
            }
        }
        return password.length() >= 8 && hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }



    @Override
    public String toString() {
        return "Person {" +
                "email='" + email + '\'' +
                '}'+ "\n" + "{" +
                "password='" + password + '\'' +
                '}';
    }
}
