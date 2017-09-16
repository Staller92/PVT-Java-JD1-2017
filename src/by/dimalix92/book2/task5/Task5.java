package by.dimalix92.book2.task5;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by LIKHTAROVICH on 26.08.2017.
 * Создать программу, которая может приветствовать пользователя на трех языках:
 * английском, русском, белорусском. Требуемый язык и страна должны сообщаться программе
 * в качестве входных параметров. Если входные параметры отсутствуют, программа должна
 * выдавать собщение на английском.
 */


public class Task5 {
    public static void main(String[] args) {
        String language;
        String country;

        if (args.length != 2) {
            language = new String("en");
            country = new String("US");
        } else {
            language = new String(args[0]);
            country = new String(args[1]);
        }
        Locale myLocale = new Locale(language, country);
        ResourceBundle resourceBundle = ResourceBundle.getBundle("MyBundle", myLocale);
        System.out.println(resourceBundle.getString("greetings"));
    }


}





