package by.dimalix92.book1.task13;

/**
 * Created by LIKHTAROVICH on 30.07.2017.
 * Решить задание на поиск простых чисел с использованием break.
 */
public class Task13 {

    public static void main(String[] args) {
        int num = 18;
        boolean temp=false;
        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                temp=true;
                break;
            }
        }
        if (temp){
            System.out.println("Составное");
        }
        else System.out.println("Простое");

    }
}

