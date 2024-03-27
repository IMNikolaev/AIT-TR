package LoginPasword;

import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()-_=+";

    public static void main(String[] args) {
        String password = generatePassword();
        System.out.println("Сгенерированный пароль: " + password);
    }

    public static String generatePassword() {
        SecureRandom random = new SecureRandom();

        StringBuilder sb = new StringBuilder();

        // Генерируем по одному символу из каждой категории
        sb.append(UPPER.charAt(random.nextInt(UPPER.length())));
        sb.append(LOWER.charAt(random.nextInt(LOWER.length())));
        sb.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
        sb.append(SPECIAL.charAt(random.nextInt(SPECIAL.length())));

        for (int i = 4; i < 8; i++) {
            String allChars = UPPER + LOWER + DIGITS + SPECIAL;
            sb.append(allChars.charAt(random.nextInt(allChars.length())));
        }

        String password = sb.toString();
        char[] passwordArray = password.toCharArray();
        for (int i = 0; i < passwordArray.length; i++) {
            int randomIndex = random.nextInt(passwordArray.length);
            char temp = passwordArray[i];
            passwordArray[i] = passwordArray[randomIndex];
            passwordArray[randomIndex] = temp;
        }

        return new String(passwordArray);
    }
}
