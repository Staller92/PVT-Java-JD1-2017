package by.dimalix92.book1.task30;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by LIKHTAROVICH on 13.08.2017.
 * Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинпния и слов.
 */
public class Task30Var2 {
    public static void main(String[] args)  {
        List<String> list = new ArrayList<String>();
        int n = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\src\\by\\dimalix92\\task30\\text1.txt"));
            n = 0;
            while (reader.ready()) {
                String str = reader.readLine();

                for (int i = 0; i < str.length(); i++) {
                    if ((str.charAt(i) == ',') || (str.charAt(i) == '.') || (str.charAt(i) == '!') || (str.charAt(i) == ';') || (str.charAt(i) == ':') || (str.charAt(i) == '-') || (str.charAt(i) == '"') || (str.charAt(i) == '?')) {
                        n++;
                    }
                }
                if (!str.isEmpty()) {

                    String[] words = str.split("[^a-zA-Zа-яА-Я]+");
                    for (String x : words) {
                        list.add(x);

                    }
                }
            }reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Знаков препинания в текте: " + n);
        System.out.println("Количество слов в тексте: " + (list.size()));

    }

}