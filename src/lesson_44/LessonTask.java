package lesson_44;

import java.io.*;

public class LessonTask {
    public static void main(String[] args) {
        String papka = "files";
        int count = 10;
        File directory = new File(papka);
        if (!directory.exists()) {
            directory.mkdir();
        }

        for (int i = 1; i <= count; i++) {
            String fileName = "file" + i + ".txt";
            String fileContent = "Java" + i;

            try {
                File file = new File(papka, fileName);
                FileWriter writer = new FileWriter(file);
                writer.write(fileContent);
                System.out.println("Файл " + fileName + " успешно создан.");
            } catch (IOException e) {
                System.out.println("Ошибка при создании файла " + fileName + ": " + e.getMessage());
            }
        }
        String mytext = "Java7";

        if ((directory.exists()) && directory.isDirectory()) {
            File[] files = directory.listFiles();
            for (File file : files) {
                if (containF(file, mytext)) {
                    System.out.println(file.getName());
                }
            }
        }
    }

    private static boolean containF(File file, String string) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(string)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
