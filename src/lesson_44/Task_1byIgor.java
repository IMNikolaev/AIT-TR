package lesson_44;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.LinkOption.NOFOLLOW_LINKS;
import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
public class Task_1byIgor {

    public static void main(String[] args) {

        try {

            Path bytes = Files.copy(

                    new java.io.File("src/lesson_44/files/task1byIgor.txt").toPath(),

                    new java.io.File("src/lesson_44/files/CopybyIgor.txt").toPath(),

                    REPLACE_EXISTING,

                    COPY_ATTRIBUTES,

                    NOFOLLOW_LINKS);
            System.out.println("We do IT!!!");



        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}
