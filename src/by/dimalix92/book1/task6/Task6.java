package by.dimalix92.book1.task6;

/**
 * Created by LIKHTAROVICH on 30.07.2017.
 * Имееются три числа - день, месяц и год. Вывести в виде трех чисел дату следующего дня.
 */
public class Task6 {

    public static void main(String[] args) {

        int day = 29;
        int month = 2;
        int year = 2020;

        int daysInMonth = checkDaysInMonth(month, year);
        if (day > daysInMonth || month > 12) {
            System.out.println("Wrong date!");
        } else {
            if (day < daysInMonth) {
                System.out.println((day + 1) + "." + month + "." + year);
            }
            if (day == daysInMonth) {
                if (month != 12) {
                    System.out.println(1 + "." + (month + 1) + "." + year);
                } else {
                    System.out.println(1 + "." + 1 + "." + (year + 1));
                }
            }
        }

    }


    private static int checkDaysInMonth(int month, int year) {
        int days = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
        }
        return days;
    }
}
