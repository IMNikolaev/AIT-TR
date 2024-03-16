package lesson_43;

public class PasswordValidator {
    public static void validate(String password) throws PasswordValidatorException {
        if (password == null || password.length() < 8) throw new PasswordValidatorException("Short password");

        boolean isLowerCase = false;
        boolean isUpperCase = false;
        boolean isDigit = false;
        boolean isSpacialSymbol = false;



        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isDigit(c)) {
                isDigit = true;
                continue;
            }

            if (Character.isLowerCase(c)) {
                isLowerCase = true;
                continue;
            }
            if (Character.isUpperCase(c)) {
                isUpperCase = true;
                continue;
            }

            if ("!%$@&*()[]".indexOf(c) >= 0) {
                isSpacialSymbol = true;
                continue;
            }

        }
        if (!isLowerCase) throw new PasswordValidatorException("No LowerCase");
        if (!isUpperCase) throw new PasswordValidatorException("No UpperCase");
        if (!isDigit) throw new PasswordValidatorException("No Digit");
        if (!isSpacialSymbol) throw new PasswordValidatorException("No DSpacial Symbol");
    }
}
