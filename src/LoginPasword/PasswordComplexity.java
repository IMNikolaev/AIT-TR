package LoginPasword;

public class PasswordComplexity {
    public static void main(String[] args) {
        String password = "Pas1!"; // Замените на ваш пароль

        long startTime = System.currentTimeMillis();
        bruteForce(password);
        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;
        System.out.println("Ваш пароль может быть взломан за " + elapsedTime + " миллисекунд");
    }

    public static void bruteForce(String password) {
        int minLength = 4; // Минимальная длина пароля
        int maxLength = 9; // Максимальная длина пароля для перебора (для этого примера)
        StringBuilder sb = new StringBuilder();
        bruteForceHelper(sb, password.toCharArray(), minLength, maxLength, 0);
    }

    private static void bruteForceHelper(StringBuilder sb, char[] password, int minLength, int maxLength, int position) {
        if (position == maxLength) {
            if (sb.toString().equals(String.valueOf(password))) {
                System.out.println("Пароль взломан: " + sb.toString());
            }
            return;
        }

        // Для первого символа добавляем только буквы
        if (position == 0) {
            for (char c = 'A'; c <= 'z'; c++) {
                if (Character.isLetter(c)) {
                    sb.append(c);
                    bruteForceHelper(sb, password, minLength, maxLength, position + 1);
                    sb.setLength(sb.length() - 1);
                }
            }
        } else {
            for (char c = '!'; c <= '~'; c++) { // ASCII символы ! - ~ (исключая пробел)
                sb.append(c);
                bruteForceHelper(sb, password, minLength, maxLength, position + 1);
                sb.setLength(sb.length() - 1);
            }
        }
    }
}
