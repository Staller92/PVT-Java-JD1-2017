package by.dimalix92.book1.task15;

/**
 * Created by LIKHTAROVICH on 30.07.2017.
 * Определить сумму элементов массива, расположенных между минимальным и максимальными
 * значениями
 */
public class Task15 {
    public static void main(String[] args) {
        int marks[] = {4, 5, 3, 7, 9, 8, 10, 7, 8};
        int max = marks[0];
        int min = marks[0];
        int maxNum = 0;
        int minNum = 0;
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
                maxNum = i;
            }
            if (marks[i] < min) {
                min = marks[i];
                minNum = i;
            }
        }

        if (minNum < maxNum) {
            for (int k = minNum+1; k < maxNum; k++) {
                sum = sum + marks[k];

            }
        } else {
            for (int k = maxNum+1; k < minNum; k++) {
                sum = sum + marks[k];
            }
        }

        System.out.println("Сумма между Max и Min: " + sum);


    }


}
