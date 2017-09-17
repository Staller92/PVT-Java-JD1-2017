package by.dimalix92.extra.petFactory;

/**
 * Created by LIKHTAROVICH on 19.08.2017.
 */
public class Cat extends Pet {
    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    protected void say() {
        System.out.println("Мяу-Мяу киски!");
    }
}
