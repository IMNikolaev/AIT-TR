package lesson_44;

import java.io.*;
import java.util.ArrayList;

public class Task_1 {
    public static void main(String[] args) {
        String filePath = "src/lesson_44/files/task1.txt";
        ArrayList<String> buffer = new ArrayList<>();
        try {
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                buffer.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        buffer.forEach(System.out::println);
        File fileName = new File("src/lesson_44/files/", "copy.txt");
        fileName.delete();

        for (int i = 0; i < buffer.size(); i++) {
            try(
                    FileWriter fileWriter = new FileWriter(fileName, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            ) {
                fileName.createNewFile();

                String toWrite = buffer.get(i);
                bufferedWriter.write(toWrite);
                bufferedWriter.newLine();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}


