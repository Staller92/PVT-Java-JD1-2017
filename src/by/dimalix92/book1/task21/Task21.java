package by.dimalix92.book1.task21;

/**
 * Created by LIKHTAROVICH on 03.08.2017.
 * Напишите два цикла выполняющих многократное сложене строк,
 * один с помощью оператора сложения и String, а другой с помощью
 * StringBuilder и метода append. Сравните скорость их выполнения.
 */
public class Task21 {
    public static void main(String[] args) {
        timeIsMoney();
        stringExecute();

    }

    public static void stringExecute() {

        String x = "JAVA";
        for (int i = 0; i < 10_000; i++) {
            if (x.length() > 2) {
                x = x.substring(0, x.length() / 2) + i + x.substring(x.length() / 2);
            } else {
                x = x + i;
            }

        }
    }



    public static void stringBuffExecute() {

        StringBuffer stringBuffer = new StringBuffer("JAVA");
        for (int i = 0; i < 10_000; i++) {
            stringBuffer.insert(stringBuffer.length() / 2, "FOREVER");
        }
    }

    public static void timeIsMoney() {
        long timeStart = System.currentTimeMillis();
        //stringExecute();
        stringBuffExecute();
        long timeEnd = System.currentTimeMillis();
        long executiveTime = timeEnd - timeStart;
        System.out.println("Execution time: " + (double) executiveTime / 1000 + " sec");
    }

}
