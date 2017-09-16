package by.dimalix92.book2.task6;

import java.io.*;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by LIKHTAROVICH on 26.08.2017.
 *
 */
public class Log {
    private static Log log;

    public static Log getLog() {
        if (log == null) {
            log = new Log();
        }
        return log;
    }

    private Log() {
    }

    Locale locale = new Locale("en", "US");
   DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, locale);

    public void logger(String error) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "\\src\\by\\dimalix92\\book2\\Solution\\log.txt", true))) {
            writer.write(error + "\t\t" + dateFormat.format(new Date()) + "\r");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
