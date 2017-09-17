package by.dimalix92.extra.arrays;


/**
 * Created by LIKHTAROVICH on 26.07.2017.
 * Разработать программу сортировки по убыванию двухмерного массива [10][10] с целочисленным типом данных
 - Инициализировать элементы массива значениями используя Random
 - Отсортированный массив вывести в консоль, пример отсортированного массива [3][3]:
 0,1,3
 5,6,7
 7,8,9
 */
public class Array {
    int[][] array = new int[10][10];

    public static void main(String[] args) {

        Array array = new Array();
        array.arrayRandomIn(array.array);
        array.arrayOut(array.array);

        array.arraySort(array.array);
        array.arrayOut(array.array);
    }

    //Метод распечатывает двухмерный массив
    public void arrayOut(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //Метод заполняет массив рандомными значениями
    public void arrayRandomIn(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
    }


    public void arraySort(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = i, m = j + 1; k < array.length; m++) {
                    if (m < array[i].length) {
                        if (array[i][j] > array[k][m]) {
                            int x = array[i][j];
                            array[i][j] = array[k][m];
                            array[k][m] = x;
                        }
                    } else {
                        k++;
                        m = -1;
                    }
                }
            }
        }
    }

}
