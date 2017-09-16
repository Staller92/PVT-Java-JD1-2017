package by.dimalix92.book1.task31;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by LIKHTAROVICH on 13.08.2017.
 * Имеется файл с текстом в котором присутствуют числа.
 * Найти все числа, распечатать, посчитать сумму, убрать все повторяющиеся числа и снова распечатать.
 */
public class Task31 {
    public static void main(String[] args) {
        String text = readFrom("D:\\My tasks\\Java\\PVT\\src\\by\\dimalix92\\task31\\text.txt");
        List<Integer> list = parseToNumbers(text);
        showList(list);
        deleteTheSame(list);
        showList(list);

    }

    public static List<Integer> parseToNumbers(String text) {
        List<Integer> list = new ArrayList<Integer>();
        String[] words = text.split("[^0-9a-zA-Zа-яА-Я]+");
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher;
        for (String x : words) {
            matcher = pattern.matcher(x);
            if (matcher.find()) {
                String[] numbers = x.split("[^0-9]+");
                for (String y : numbers) {
                    if (y.hashCode() != 0)
                        list.add(Integer.parseInt(y));
                }
            }
        }
        return list;

    }

    public static String readFrom(String adress) {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(adress))) {
            while (reader.ready()) {
                stringBuilder.append(reader.readLine() + "\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }


    public static void showList(List<Integer> list) {
        System.out.println("Вывод всех чисел : ");
        int sum = 0;
        for (int x : list) {
            System.out.println(x);
            sum = sum + x;
        }
        System.out.println("Сумма всех чисел в тексте: " + sum+"\n");
    }

    public static void deleteTheSame(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        for (int x : list) {
            set.add(x);
        }
        list.clear();
        for (int x : set) {
            list.add(x);
        }
    }
}
