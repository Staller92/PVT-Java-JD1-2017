package by.dimalix92.book1.task7;

/**
 * Created by LIKHTAROVICH on 29.07.2017.
 * Имеются два дома размерами a на b и c на d. Имеется участок размерами e на f. Проверить помещаются ли эти
 * дома на данном участке. Стороны домов - параллельны сторонам участка, в остальном размещение может быть лбым.
 */
public class Task7 {
    public static void main(String[] args) {
        int a=1;
        int b=5;
        int c=4;
        int d=6;
        int e=5;
        int f=5;

if ((b+d<=f)&&(a<=e)&&(c<=e))
{System.out.println("Подходит");}
else if ((b+c<=f)&&(a<=e)&&(d<=e))
{System.out.println("Подходит");}
else if ((a+d<=f)&&(b<=e)&&(c<=e))
{System.out.println("Подходит");}
else if ((a+c<=f)&&(b<=e)&&(d<=e))
{System.out.println("Подходит");}
else if ((a+c<=e)&&(b<=f)&&(d<=f))
{System.out.println("Подходит");}
else if ((b+c<=e)&&(a<=f)&&(d<=f))
{System.out.println("Подходит");}
else if ((c+b<=e)&&(d<=f)&&(a<=f))
{System.out.println("Подходит");}
else if ((b+c<=e)&&(a<=f)&&(c<=f))
{System.out.println("Подходит");}
else {System.out.println("Не Подходит");}
    }

}
