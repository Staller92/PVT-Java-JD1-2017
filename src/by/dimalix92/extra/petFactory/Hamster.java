package by.dimalix92.extra.petFactory;

/**
 * Created by LIKHTAROVICH on 19.08.2017.
 */
public class Hamster extends Pet {
    public Hamster() {
    }
    public Hamster(String name) {
        super(name);
    }

    @Override
    protected void say() {
        System.out.println("Эй людишки где мое колесо?");
    }
}
