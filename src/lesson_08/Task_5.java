package lesson_08;

public class Task_5 {
    public static void main(String[] args) {
        String [] massiv = {"One", "Two", "Twenty"};
        String maxLenghtWord = massiv[0];
        for (int i = 0; i < massiv.length; i++){
            if (massiv[i].length() > maxLenghtWord.length()){
                maxLenghtWord = massiv[i];
            }
        }
        for (int j = 0; j < maxLenghtWord.length(); j++){
            System.out.println(maxLenghtWord.charAt(j));
        }
    }
}

