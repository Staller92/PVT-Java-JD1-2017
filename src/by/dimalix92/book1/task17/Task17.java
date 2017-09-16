package by.dimalix92.book1.task17;

/**
 * Created by LIKHTAROVICH on 30.07.2017.
 * Создать двухмерный квадатный массив, и заполнить его бабочкой.
 * т.е таким образом:
 * 111
 * 010
 * 111
 */
public class Task17 {
    public static void main(String[] args) {

        int[][] arr = new int[10][10];
        for (int i = 0; i <= arr.length / 2; i++) {
            for (int j = 0; j <= arr[i].length / 2; j++) {
                if (i <= j) {
                    arr[i][j] = 1;
                } else arr[i][j] = 0;

            }
        }
        for (int i = arr.length - 1; i >= arr.length / 2; i--) {
            for (int j = 0; j <= arr.length / 2; j++) {
                if (j < arr.length - 1 - i) {
                    arr[i][j] = 0;
                } else arr[i][j] = 1;

            }
        }
        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = arr.length/2; j <= arr.length-1; j++) {
                if (arr.length-1-j <  i) {
                    arr[i][j] = 0;
                } else arr[i][j] = 1;

            }
        }
        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = arr.length/2; j <= arr.length-1; j++) {
                if (arr.length-1-j <  i) {
                    arr[i][j] = 0;
                } else arr[i][j] = 1;

            }
        }

        for (int i = arr.length/2; i <=arr.length-1; i++) {
            for (int j = arr.length/2; j <= arr.length-1; j++) {
                if (i <  j) {
                    arr[i][j] = 0;
                } else arr[i][j] = 1;

            }}

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }


    }
}