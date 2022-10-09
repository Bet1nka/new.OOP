package hw4;



public class Main {
    public static void main(String[] args) {

        FruitBox box1 = new FruitBox();
        FruitBox box2 = new FruitBox();
        box1.addfruit(new Apple());
        box1.addfruit(new Apple());
        box1.addfruit(new Orange());
        box1.addfruit(new Apple());
        box2.addfruit(new Orange());

        System.out.println(box1);
        box1.changeBox(box2);
        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box1.compare(box2));




    }
}
