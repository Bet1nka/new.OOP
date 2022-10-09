package hw4;

public class Apple extends Fruit{
    public Apple() {
        super(1.5f);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weigth=" + weigth +
                '}';
    }
}
