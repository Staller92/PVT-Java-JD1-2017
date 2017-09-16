package by.dimalix92.book1.task10;

/**
 * Created by LIKHTAROVICH on 29.07.2017.
 * Имеется целое число. Следует посчитать сумму цифру данного числа.
 */
public class Task10 {
    public static void main(String[] args) {
        int n=984266;
        int sum=0;

        while(n!=0){
            sum=sum+(n%10);
            n=n/10;
        }
        System.out.println(sum);
    }

}
