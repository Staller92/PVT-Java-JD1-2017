package by.dimalix92.book1.task5;

import java.util.Random;

/**
 * Created by LIKHTAROVICH on 29.07.2017.
 * Имеется целое число (любое), это число - сумма денег в рублях.
 * Вывести это число, добавив к нему слово рублей в правильном падеже.
 */
public class Task5 {
    public static void main(String[] args) {
        Random random=new Random();
        severalNum(random.nextInt(1000));

    }
   public static String singleNum(int snum){
       String text="";
switch (snum){
    case 1:
        text= " рубль";
    break;
    case 0:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
        text= " рублей";
        break;
    case 2:
    case 3:
    case 4:
       text= " рубля";
        break;
    }
return text;
    }
    public static void severalNum(int snum){

        if((snum/10)%10==1)
        System.out.println(snum+" рублей");
        else System.out.println(snum+singleNum(snum%10));
    }
}
