package by.dimalix92.book1.task8;

/**
 * Created by LIKHTAROVICH on 29.07.2017.
 * Изменит пример с суммой чисел таким образом, что бы рассчитываласб не сумма,
 * а произведение, т.е факториал числа.
 */
public class Task8 {
    public static void main(String[] args) {
        int sum=1;
        int i=1;
        while (i<10)
        {
            sum=sum*i;
            i++;
        }
        System.out.println(sum);
    }
}
