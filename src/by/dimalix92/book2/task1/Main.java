package by.dimalix92.book2.task1;

/**
 * Created by LIKHTAROVICH on 20.08.2017.
 * Напишите программу, моделирующую кассы в магазине. Существует несколько касс, работающих одновременно.
 * Каждый покупатель - отдельный поток. Общее количество покупателей может быть больше чем количество касс, но
 * одновременно не может обрабатываться больше покупателей чем имеется рабочих касс. У каждого покупателя есть
 * набор товаров, которые должны быть выведены в процессе обслуживания.
 */
class Main {
    private static final int amountOfCustumers=10;
    private static final int amountOfCashBox=4;
    public static void main(String[] args)  {

        CustomerThread customerThread;
        CashBox[] cashBoxArray = new CashBox[amountOfCashBox];
        for (int i = 0; i < cashBoxArray.length; i++) {
            cashBoxArray[i] = new CashBox((int)(Math.random()*99999));
        }

        for (int i = 0, j = 0; i <amountOfCustumers ; i++, j++) {
            if (j == cashBoxArray.length) {
                j = 0;
            }

            customerThread= new CustomerThread(cashBoxArray[j]);
            customerThread.start();

            try {
               Thread.sleep(100);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("All customers are serviced");

    }
}
