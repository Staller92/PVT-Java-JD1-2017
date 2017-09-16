package by.dimalix92.book1.task11;

/**
 * Created by LIKHTAROVICH on 30.07.2017.
 * Имеется целое число, определить является ли это число простым т.е
 * делится без остатка только на 1 и на себя.
 */
public class Task11 {

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
