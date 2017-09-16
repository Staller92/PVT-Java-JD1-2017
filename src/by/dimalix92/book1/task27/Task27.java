package by.dimalix92.book1.task27;

import java.util.*;

/**
 * Created by LIKHTAROVICH on 10.08.2017.
 * Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа.
 */
public class Task27 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            marks.add((int) (Math.random() * 10));
        }

        printMarks(marks);
        removeTheSameVar1(marks);
       // removeTheSameVar2(marks);
        System.out.println();
        printMarks(marks);
    }

    public static void printMarks(List<Integer> marks) {
        for (Integer x : marks) {
            System.out.print(x);
        }
    }

    public static void removeTheSameVar1(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size() - 1; j++) {
                if (list.get(i).equals(list.get(j + 1))) {
                    list.remove(j + 1);
                    j--;
                }
            }
        }

    }
// Отсортированная коллекция
    /*public static void removeTheSameVar2(List<Integer> marks) {

        for (int i = marks.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (marks.get(j) > marks.get(j + 1)) {
                    int temp = marks.get(j);
                    marks.set(j, marks.get(j + 1));
                    marks.set(j + 1, temp);
                }
            }
        }
        for (int j = 0; j < marks.size() - 1; j++) {
            for (int i = 0; i < marks.size() - 1; i++) {
                if (marks.get(i) == marks.get(i + 1)) {
                    marks.remove(i + 1);
                }
            }
        }

    }*/

}

