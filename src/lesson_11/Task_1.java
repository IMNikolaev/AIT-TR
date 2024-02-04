 package lesson_11;

public class Task_1 {
    public static void main(String[] args) {
        String[] stringArray = {null, null, "1123", "\\n"};
        String[] result = minAndMaxWords(stringArray);
        System.out.println("Минимальное слово: " + result[0]);
        System.out.println("Максимальное слово: " + result[1]);
    }

    public static String[] minAndMaxWords(String[] sArray) {
        String[] minAndMaxWordsArray = new String[2];
        int minWord = -1;
        int maxWord = -1;
        if (sArray == null) {
            minAndMaxWordsArray[0] = "null";
            minAndMaxWordsArray[1] = "null";
            return minAndMaxWordsArray;
        } else {
            for (int i = 0; i < sArray.length; i++) {
                if (sArray[i] != null && sArray[i].length() > 0) {
                    if (minWord == -1 || sArray[i].length() < sArray[minWord].length()) {
                        minWord = i;
                    }
                }
            }
            for (int i = 0; i < sArray.length; i++) {
                if (sArray[i] != null && sArray[i].length() > 0) {
                    if (maxWord == -1 || sArray[i].length() > sArray[maxWord].length()) {
                        maxWord = i;
                    }
                }
            }
            if (minWord != -1) {
                minAndMaxWordsArray[0] = sArray[minWord];
            }
            if (maxWord != -1) {
                minAndMaxWordsArray[1] = sArray[maxWord];
            }
            return minAndMaxWordsArray;
        }
    }
}