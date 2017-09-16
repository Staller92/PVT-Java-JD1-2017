package by.dimalix92.book1.task16;

/**
 * Created by LIKHTAROVICH on 30.07.2017.
 * Создать массив, заполнить его случайными элементами, распечатать, перевернуть, и снова распечатать
 * (при переворачивании нежелательно создавать еще один массив)
 */
public class Task16 {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

}
