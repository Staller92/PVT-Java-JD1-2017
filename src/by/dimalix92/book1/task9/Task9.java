package by.dimalix92.book1.task9;

/**
 * Created by LIKHTAROVICH on 29.07.2017.
 * Имеентся последовательность случайных чисел, найти и вывести наибольшее из них.
 */
public class Task9 {
    public static void main(String[] args) {
        int max=0;
        for (int i = 0; i <10 ; i++)
        {
            int x=(int)(Math.random()*100);
            if (x>max)
            {max=x;}
            System.out.println(max);
                    }
        System.out.println(max);
    }

}
