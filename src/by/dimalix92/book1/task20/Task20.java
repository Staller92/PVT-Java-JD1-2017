package by.dimalix92.book1.task20;

/**
 * Created by LIKHTAROVICH on 30.07.2017.
 * Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.
 */
public class Task20 {
    public static void main(String[] args) {

        String str = "   Программа,   которая  ?      ,     ...  вывводит текст из последних букв всех слов. !!";
        String str2 = str.trim();
        String[] words = str2.split("[^0-9a-zA-Zа-яА-Я]+");

        for (String x : words) {
            System.out.print(x.charAt(x.length() - 1));
        }
    }
}
