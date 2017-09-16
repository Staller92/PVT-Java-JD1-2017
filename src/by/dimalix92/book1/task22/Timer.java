package by.dimalix92.book1.task22;

/**
 * Created by LIKHTAROVICH on 05.08.2017.
 * Создать класс и объекты описывающие промежуток времени. Сам промежуток в классе должен задаваться
 * тремя свойствами: секундами, минутами, часами. Сделать методы для получкния полного количества секунд в объекте,
 * сравнения двух объектов( метод должен работать аналогично compareTo в строках). Создать два конструктора:
 * получающей общее количество секунд, и часы, минуты и секунды по отдельности. Сделать метод для вывода данных. *
 */
public class Timer {
    private int sec;
    private int min;
    private int hour;

    public Timer(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public Timer(int seconds) {

        int sec = seconds % 60;
        int m = (seconds - sec) / 60;
        int min = m % 60;
        int hour = (m - min) / 60;
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getSec() {
        return sec;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMin() {
        return min;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }


    public void showFullTimeSec() {
        long time = (long) (sec + (min * 60) + (hour * 3600));
        System.out.println("Полное время: " + time + performSec(time));
    }

    public long compareTime(Timer ob) {
        long t1 = (long) (this.sec + (this.min * 60) + (this.hour * 3600));
        long t2 = (long) (ob.sec + (ob.min * 60) + (ob.hour * 3600));
        return t1 - t2;
    }

    public static String performSec(long snum) {
        String text = "";
        if ((snum / 10) % 10 == 1)
            return "секунд";
        else {
            switch ((int) (snum % 10)) {
                case 1:
                    text = " секунда";
                    break;
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    text = " секунд";
                    break;
                case 2:
                case 3:
                case 4:
                    text = " секунды";
                    break;
            }
            return text;
        }
    }

    public static void main(String[] args) {
        Timer object1 = new Timer(3, 19, 37);
        Timer object2 = new Timer(11977);
        object1.showFullTimeSec();
        System.out.println(object1.compareTime(object2));
    }


}
