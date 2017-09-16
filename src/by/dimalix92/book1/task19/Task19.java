package by.dimalix92.book1.task19;

/**
 * Created by LIKHTAROVICH on 30.07.2017.
 * Имеется строка с текством. Подсчитать количество слов в тексте.
   желательно учесть, что слова могут разделяться несколькими пробелами,
   в начале и конце текста также могут быть пробелы, но могут и отсутствовать.
 */
public class Task19 {
    public static void main(String[] args) {
        String str = "   Программа,   которая может ?      ,     ...  посчитать количество слов в тесте и учитывает пробелы. !!";
        String str2=str.trim();
        String[] words = str2.split("[^0-9a-zA-Zа-яА-Я]+");
        int i=0;
        for (String word : words){
            i++;
            System.out.println(word);
        }
        System.out.println("Количество слов в тексте: " +i);
    }

}
