package by.dimalix92.book1.task28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by LIKHTAROVICH on 10.08.2017.
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
 * Найти самую высокую оценку с испоьзованием итератора.
 */
public class Task28 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            marks.add((int) (Math.random() * 10));
        }
        printMarks(marks);
        findMax(marks);
    }

    public static void findMax(List<Integer> marks) {
        Iterator<Integer> iterator = marks.iterator();
        int max=0;
        int temp=0;
        while (iterator.hasNext()) {
            temp=iterator.next();
            if (temp > max) {
                max=temp;
            }
        }
        System.out.println("Max mark is: "+ max);
    }
    public static void printMarks(List<Integer> marks) {
        for (Integer x : marks) {
            System.out.print(x);
        }
        System.out.println();
    }

}
