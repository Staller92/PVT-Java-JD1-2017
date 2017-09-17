package by.dimalix92.extra.petFactory;

/**
 * Created by LIKHTAROVICH on 19.08.2017.
 */
public class Dog extends Pet{
    public Dog() {
    }
    public Dog(String name) {
        super(name);
    }

    @Override
    protected void say() {
        System.out.println("Гав-Гав сучки");
    }
}
