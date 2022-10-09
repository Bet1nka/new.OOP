package hw4;

import java.util.ArrayList;
import java.util.List;

public class FruitBox <E extends Fruit>  {
     private float weight;
     private List<E> box;

    public FruitBox() {
        this.box = new ArrayList<>();
    }

    private List<E> getBox() {
        return box;
    }
    public void addfruit(E fruit){
        if(box.isEmpty() || box.get(0).getClass().equals(fruit.getClass())){
            box.add(fruit);
            weight+= fruit.getWeigth();
        }
        else System.out.println("Возьми другой фрукт");
    }


    public float getWeight() {
        return weight;
    }

    private void setBox(List<E> box) {
        this.box = box;
    }

    @Override
    public String toString() {
        return ""+box;
    }
    public Boolean compare( FruitBox o2){
         if (this.getWeight() == o2.getWeight())return true;
         else return false;
    }
    public void changeBox (FruitBox box) {
        if(box.getBox().isEmpty()||getClass1(box)==true){
        box.getBox().addAll(this.getBox());
        this.getBox().removeAll(this.getBox());}
        else System.out.println("возьми другой фрукт");

    }
    private Boolean getClass1(FruitBox box){
        if(this.getBox().getClass().equals(box.getBox().get(0).getClass()))return true;
        else return false;
    }
}





