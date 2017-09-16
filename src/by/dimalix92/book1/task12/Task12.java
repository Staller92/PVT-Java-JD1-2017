package by.dimalix92.book1.task12;

/**
 * Created by LIKHTAROVICH on 30.07.2017.
 * Имеется целое число, следует вывести его в бухгалтерском формате.
 * Т.е начиная справа каждые три позиции определяются пробелом. Например число
 * 20023143 должно быть выведено как 20 023 143
 */
public class Task12 {
    public static void main(String[] args) {
        int n=984932942;
        int z=n;
        int k=0;
        while(n!=0){
            n=n/1000;
            k++;
        }

        for (int i = k-1, x=0; i >=0 ; i--) {
            x=z/(int)(Math.pow(1000, i));
            z=z-x*(int)(Math.pow(1000, i));
            System.out.print(x+" ");

        }




    }


}
