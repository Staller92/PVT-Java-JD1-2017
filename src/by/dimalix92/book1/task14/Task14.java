package by.dimalix92.book1.task14;

/**
 * Created by LIKHTAROVICH on 30.07.2017.
 * В задаче на поиск максимальной оценки, вывести не саму оценку, а ее номер.
 */
public class Task14 {
    public static void main(String[] args) {
        int marks[] = {1, 5, 3, 7, 9, 10, 5, 7, 8};
        int max = marks[0];
        int maxNum = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
                maxNum = i;
            }
        }

        System.out.println("Номер максимальной оценци: " + maxNum);

    }

}
