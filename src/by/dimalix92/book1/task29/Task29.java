package by.dimalix92.book1.task29;

import java.util.*;

/**
 * Created by LIKHTAROVICH on 10.08.2017.
 * * Имеется текст. Следует составить для него частотный словарь.
 */
public class Task29 {

    public static void main(String[] args) {
        String str = "Вороне где-то бог послал кусочек сыру;\n" +
                "На ель Ворона взгромоздясь,\n" +
                "Позавтракать было совсем уж собралась,\n" +
                "Да призадумалась, а сыр во рту держала.\n" +
                "На ту беду Лиса близехонько бежала;\n" +
                "Вдруг сырный дух Лису остановил:\n" +
                "Лисица видит сыр, Лисицу сыр пленил.\n" +
                "Плутовка к дереву на цыпочках подходит;\n" +
                "Вертит хвостом, с Вороны глаз не сводит\n" +
                "И говорит так сладко, чуть дыша:\n" +
                "\"Голубушка, как хороша!\n" +
                "Ну что за шейка, что за глазки!\n" +
                "Рассказывать, так, право, сказки!\n" +
                "Какие перушки! какой носок!\n" +
                "И, верно, ангельский быть должен голосок!\n" +
                "Спой, светик, не стыдись! Что, ежели, сестрица,\n" +
                "При красоте такой и петь ты мастерица,-\n" +
                "Ведь ты б у нас была царь-птица!\"\n" +
                "Вещуньина с похвал вскружилась голова,\n" +
                "От радости в зобу дыханье сперло,-\n" +
                "И на приветливы Лисицыны слова\n" +
                "Ворона каркнула во все воронье горло:\n" +
                "Сыр выпал - с ним была плутовка такова.";
        String[] words = str.toUpperCase().split("[^0-9a-zA-Zа-яА-Я]+");
        List<String> list = new LinkedList<String>(Arrays.asList(words));
        Map<String, Integer> map = new TreeMap<>();
        frequency(list, map);
        System.out.println(map);

    }

    public static void frequency(List<String> list, Map<String, Integer> map) {
        for (int i = 0; i < list.size(); i++) {
            int k = 1;
            map.put(list.get(i), k);
            for (int j = i; j < list.size() - 1; j++) {
                if (list.get(i).equals(list.get(j + 1))) {
                    list.remove(j + 1);
                    j--;
                    k++;
                    map.put(list.get(i), k);
                }
            }
        }

    }

}
