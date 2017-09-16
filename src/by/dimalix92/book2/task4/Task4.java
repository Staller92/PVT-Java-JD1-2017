package by.dimalix92.book2.task4;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by LIKHTAROVICH on 26.08.2017.
 * Написать код выводящий число 153.5 в денежном виде ля Украины.
 */
public class Task4 {
    public static void main(String[] args) {
        Locale myLocale = new Locale("uk","UA");
        NumberFormat numberFormat =NumberFormat.getCurrencyInstance(myLocale);
        System.out.println(numberFormat.format(153.5));
    }

}
