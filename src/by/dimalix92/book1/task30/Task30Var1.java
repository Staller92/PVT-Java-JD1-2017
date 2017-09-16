package by.dimalix92.book1.task30;

import java.io.*;


/**
 * Created by LIKHTAROVICH on 13.08.2017.
 * Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинпния и слов.
 */
public class Task30Var1 {
    public static void main(String[] args)  {

        StringBuilder stringBuilder = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\src\\by\\dimalix92\\task30\\text1.txt"));
            stringBuilder = new StringBuilder();
            while (reader.ready()) {
                stringBuilder.append(" " + reader.readLine());
            }reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }catch (IOException e) {
            e.printStackTrace();
        }


        String str = stringBuilder.toString();
        countPunctuationMarks(str);
        countWords(str);
    }

    public static void countPunctuationMarks(String str) {
        int n = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == ',') || (str.charAt(i) == '.') || (str.charAt(i) == '!') || (str.charAt(i) == ';') || (str.charAt(i) == ':') || (str.charAt(i) == '-') || (str.charAt(i) == '"') || (str.charAt(i) == '?')) {
                n++;
            }
        }
        System.out.println("Знаков препинания в текте: " + n);
    }

    public static void countWords(String str) {
        String[] words = str.split("[^a-zA-Zа-яА-Я]+");
        System.out.println("Количество слов в тексте: " + (words.length - 1));
    }
}






