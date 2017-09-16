package by.dimalix92.book1.task26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by LIKHTAROVICH on 10.08.2017.
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
 * Удалить неудовлетворительные оценки из списка.
 */
public class Task26 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<Integer>();
        for (int i = 0; i < 30; i++) {
            marks.add((int) (Math.random() * 10));
        }

        printMarks(marks);
        removeMarks(marks);
        printMarks(marks);

    }


    public static void printMarks(List<Integer> marks) {
        for (Integer x : marks) {
            System.out.print(x);
        }
    }


    public static void removeMarks(List<Integer> marks) {
        Iterator<Integer> iterator = marks.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < 4) {
                iterator.remove();
            }
        }
        System.out.println();
    }

//Почему не работает через foreach?
   /* public static void removeMarks2(List<Integer> marks) {
        for (Integer x:marks) {
            if (x<4){marks.remove(x);}
        }
        System.out.println();
    }*/



    }





