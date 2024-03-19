package lesson_44;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task_2 {
    public static void main(String[] args) {

        File file = new File("src/lesson_44/files/task2.txt");
        File lessFile  = new File("src/lesson_44/files/less.txt");
        lessFile.delete();
        File moreFile  = new File("src/lesson_44/files/more.txt");
        moreFile.delete();
        Map<String,Integer> usersMoneyHistoryGet = readUHGFromFile(file);
        usersMoneyHistoryGet.forEach((k,v) -> {
            if (v<2000){writeInNewFiles(k,v,lessFile);}
            else {writeInNewFiles(k,v,moreFile);}
        });

    }

    private static void writeInNewFiles(String k, Integer v,File file) {
        try(
                FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ) {
            file.createNewFile();

            String toWrite = k + ":" + v;
            bufferedWriter.write(toWrite);
            bufferedWriter.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static Map<String, Integer> readUHGFromFile(File file) {
        Map<String,Integer> myMap = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){

            String line;

            while ((line = reader.readLine()) != null) {
                String[] strings = line.split(":");
                String userName = strings[0];
                int amount = Integer.parseInt(strings[1]);
                if (myMap.containsKey(userName)) {
                    int currentAmount = myMap.get(userName);
                    myMap.put(userName, currentAmount + amount);
                } else {
                    myMap.put(userName, amount);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return myMap;
    }

}
