package by.dimalix92.book2.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by LIKHTAROVICH on 26.08.2017.
 * Написать программу, выполняющую поиск в строке шестнадцатиричных чисел,
 * записанных по правилам Java, с помощью регулярных выражений и
 * вывести их на страницу.
 */
public class RegEx {
    public static void main(String[] args) {
        String text = "Регулярные 0x19EA выражения — формальный язык поиска и осуществления 0x1C7 ма нипуляций с 0x6EEDE подстроками в тексте,\n" +
                "основанный 0x34F4 на использовании 0x4F686 метасимволов (символов-джокеров, англ. wildcard characters).\n" +
                "По сути это строка-образец (англ. pattern,0XFF по-русски ее 0x19EA часто называют «шаблоном», «маской»),\n" +
                "состоящая из 0х270F символов  и метасимволов 0x270F,0xFFFF,0xEEEEE и 0xFF задающая 0x3039 правило поиска.";

        String[] words = text.split("[^0-9a-zA-Zа-яА-Я]+");
        Pattern pattern = Pattern.compile("0[хxXХ][0-9ABCDEF]+");
        Matcher matcher;
        for (String x : words) {
            matcher = pattern.matcher(x);
            if (matcher.matches()) {

                System.out.println(x);
            }
        }


    }
}
