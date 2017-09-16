package by.dimalix92.book1.task23;

import java.util.Scanner;

/**
 * Created by LIKHTAROVICH on 06.08.2017.
 * Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в банкомате должен задаваться тремя свойствами:
 * количество купюр номиналом 20, 50, 100. Сделать методы для добавления денег в банкомат. Сделать функцию снимающую деньги.
 * На вход передается сумма денег. На выход - булевское значение (операция удалась или нет.) При снятии денег функция
 * должна распечатывать каким количеством купюр какого номинала выдается сумма. Создать конструктор с тремя параметрами -
 * количеством купюр. Прочее - на ваше усмотрение.
 */
public class ATM {
    private int bankNote20;
    private int bankNote50;
    private int bankNote100;


    public ATM(int bankNote100, int bankNote50, int bankNote20) {
        this.bankNote20 = bankNote20;
        this.bankNote50 = bankNote50;
        this.bankNote100 = bankNote100;
    }

    public int getBankNote20() {
        return bankNote20;
    }

    public int getBankNote50() {
        return bankNote50;
    }

    public int getBankNote100() {
        return bankNote100;
    }

    public void setBankNote20(int bankNote20) {
        this.bankNote20 = bankNote20;
    }

    public void setBankNote50(int bankNote50) {
        this.bankNote50 = bankNote50;
    }

    public void setBankNote100(int bankNote100) {
        this.bankNote100 = bankNote100;
    }

    public void takeCash() {

        int max = bankNote100 * 100 + bankNote50 * 50 + bankNote20 * 20;
        System.out.println("Введите сумму наличных которую вы хотите снять!");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int money = scanner.nextInt();

                if (money <= max) {
                    cashier2(money);
                    break;

                } else System.out.println("В банкомате недостатчно средств. Введите другое число");
            } else System.out.println("Введите число");
        }
    }


    public static String performCash(int snum) {
        String text = "";
        if ((snum / 10) % 10 == 1)
            return " банкнот";
        else {
            switch (snum % 10) {
                case 1:
                    text = " банкнота";
                    break;
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    text = " банкнот";
                    break;
                case 2:
                case 3:
                case 4:
                    text = " банкноты";
                    break;
            }
            return text;
        }
    }

    public void cashier2(int money) {
        int a[] = {20, 50, 100};

        int sum = money;

        int INF = Integer.MAX_VALUE - 1; // Значение константы }бесконечность}
        int arr[] = new int[sum + 1];
        arr[0] = 0;
        int m, i;
        for (m = 1; m <= sum; m++)   // заполняем массив arr
        {                     // m - сумма, которую нужно выдать
            arr[m] = INF;           // помечаем, что сумму m выдать нельзя
            for (i = 0; i < a.length; i++)  // перебираем все номиналы банкнот
            {
                if (m >= a[i] && arr[m - a[i]] + 1 < arr[m])
                    arr[m] = arr[m - a[i]] + 1; // изменяем значение arr[m], если нашли
            }                       // лучший способ выдать сумму m
        }
        if (arr[sum] == INF) {

            System.out.println("Требуемую сумму выдать невозможно в банкомате имеются купюры номиналом 20,50,100");
            return;
        }

        System.out.println("Заберите ваши денюжки: ");

        int z = 0, j, k = a.length;
        while (k != 0 && a[--k] > sum) ;
        j = k;
        int tempSum, count;
        do {
            if ((tempSum = sum % a[j]) >= a[0] || tempSum == 0) {
                count = sum / a[j];
                sum = tempSum;
            } else {
                count = sum / a[j] - 1;
                sum = tempSum + a[j];
            }
            if (count != 0) {
                System.out.println(count + " " + performCash(count) + " номиналом " + a[j] + " рублей ");
                if (a[j] == 20) {
                    setBankNote20(getBankNote20() - count);
                } else if (a[j] == 50) {
                    setBankNote50(getBankNote50() - count);
                } else if (a[j] == 100) {
                    setBankNote100(getBankNote100() - count);
                }
            }
            while (j != 0 && a[--j] > sum) ;

        } while (z < k && sum > 0);

    }




    public static void main(String[] args) {
        ATM atm1 = new ATM(100, 100, 100);
        atm1.takeCash();

    }


}






