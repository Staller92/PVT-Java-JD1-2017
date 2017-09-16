package by.dimalix92.book1.task3;

/**
 * Created by LIKHTAROVICH on 29.07.2017.
 * Создайте число. Определите, является ли последняя цифра числа семеркой.
 */
public class Task3 {
    public static void main(String[] args) {
        int x=(int)(Math.random()*100);
        if (x%10==7) {System.out.println("Последняя цифра семерка");
            System.out.println(x);
        }
        else {System.out.println("Последняя цифра семерка не семерка");
            System.out.println(x);}
    }
}
