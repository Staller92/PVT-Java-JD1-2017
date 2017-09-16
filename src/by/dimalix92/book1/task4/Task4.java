package by.dimalix92.book1.task4;

/**
 * Created by LIKHTAROVICH on 29.07.2017.
 * Имеется прямоугольное отверстие размерами a и b, определить, можно ли его полностью
 * закрыть круглой картонкой радиусом r.
 */
public class Task4 {
    public static void main(String[] args) {
        int a=3;
        int b=4;
        int r=5;

        if (Math.sqrt(a*a+b*b)<=2*r){
            System.out.println(true);
        }
        else
            System.out.println(false);
            }
}
