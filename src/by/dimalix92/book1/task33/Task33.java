package by.dimalix92.book1.task33;

import java.io.File;
import java.io.IOException;


/**
 * Created by LIKHTAROVICH on 13.08.2017.
 * Ввести список файлов и каталогов выбранного каталога на диске.
 * Файлы и каталоги должны быть распечатаны отдельно.
 */
public class Task33 {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Program Files");
        showFiles(file);
        showDirectories(file);


    }

    public static void showDirectories(File file) throws IOException {
        System.out.println("Список каталогов в директории " + file.getCanonicalPath() + " :");
        File[] catalogs = file.listFiles();
        for (int i = 0; i < catalogs.length; i++) {
            if (catalogs[i].isDirectory()) {
                System.out.println(catalogs[i].getName());
            }
        }
        System.out.println();
    }

    public static void showFiles(File file) throws IOException {
        File[] catalogs = file.listFiles();
        System.out.println("Список файлов в директории " + file.getCanonicalPath() + " :");
        for (int i = 0; i < catalogs.length; i++) {
            if (catalogs[i].isFile()) {
                System.out.println(catalogs[i].getName());
            }
        }
        System.out.println();
    }
}
