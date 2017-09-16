package by.dimalix92.book1.task18;

/**
 * Created by LIKHTAROVICH on 30.07.2017.
 * Найти в строке не только запятые, но и другие знаки препинания.
 * Подсчитать общее их количество
 */
public class Task18 {
    public static void main(String[] args) {
        String str = "Текстовая; - : \"строка\", с запятыми!?.";
        int n = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == ',')||(str.charAt(i) == '.')||(str.charAt(i) == '!')||(str.charAt(i) == ';')||(str.charAt(i) == ':')||(str.charAt(i) == '-')||(str.charAt(i) == '"')||(str.charAt(i) == '?')) {
                n++;
            }
        }
        System.out.println(n);
    }

}
