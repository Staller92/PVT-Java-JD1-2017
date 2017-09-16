package by.dimalix92.book1.task32;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by LIKHTAROVICH on 13.08.2017.
 * Записать в двоичный файл 20 случаных чисел.
 * Прочитать записанный файл, распечатать числа и их среднее арифметическое.
 */
public class Task32 {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        DataOutputStream a = null;
        try {
            a = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(System.getProperty("user.dir")+"\\src\\by\\dimalix92\\task32\\hello.dat")));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        }

        for (int i = 0; i < 5; i++) {
            a.writeInt((int) (Math.random() * 1000));
        }
        a.close();

        DataInputStream b=null;
        try {
            b = new DataInputStream(new BufferedInputStream(new FileInputStream("D:\\My tasks\\Java\\PVT\\src\\by\\dimalix92\\task32\\hello.dat")));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }

        int res = b.readInt();
        while (true) {

            list.add(res);
            try {
                res = b.readInt();
            } catch (EOFException e) {
                break;
            }
        }
        if(b!=null){
            b.close();
        }
        average(list);

    }

    public static void average(List<Integer> list) {
        double sum = 0;
        for (int x : list) {
           System.out.println(x);
            sum = sum + x;
        }
        System.out.println("Среднее значение арифметическое равно: "+(sum / list.size()));
    }

}







