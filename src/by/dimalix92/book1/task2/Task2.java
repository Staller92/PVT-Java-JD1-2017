package by.dimalix92.book1.task2;

/**
 * Created by LIKHTAROVICH on 05.08.2017.
 * Имеется промежуток времени в секундах. Следует вывести его на страницу в виде
 * суток недель часов минут и секунд
 */
public class Task2 {
    public static void main(String[] args) {

        int s =1000000000;
        int sec = s%60;
        int m=(s-sec)/60;
        int min = m%60;
        int h =(m-min)/60;
        int hour=h%24;
        int d=(h-hour)/24;
        int day=d%7;
        int week=(d-day)/7;

        System.out.println(week+" недель " +day+" дней " +hour+" часов " + min + " минут " + sec + " секунд");


        //Второй вариант
        /*
         int s=1000000000;
         int w,week,d,day,h,hour,m,min,sec;

         w = s%(7*24*60*60);
         week =(s-w)/(7*24*60*60);
         d = w%(24*60*60);
         day = (w-d)/(24*60*60);
         h =d%(60*60);
         hour =(d-h)/(60*60);
         m=h%60;
         min=(h-m)/60;
         sec=m;

        System.out.println(week+" недель " +day+" дней " +hour+" часов " + min + " минут " + sec + " секунд");*/





    }

}
