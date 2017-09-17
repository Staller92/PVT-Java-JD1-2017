package by.dimalix92.extra.petFactory;

/**
 * Created by LIKHTAROVICH on 19.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(PetFactory.builder(Type.Кот,"Васька"));
        System.out.println(PetFactory.builder(Type.Собака,"Рекс"));
        System.out.println(PetFactory.builder(Type.Хомяк,"Опасный"));
        System.out.println(PetFactory.builder(Type.Попугай,"Кеша"));
        System.out.println(PetFactory.builder(Type.Собака));
    }
}
