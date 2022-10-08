package homework3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Person implements Comparable<Person>, PersonbyWeigth {
    public Person(int age, int heigth, int weigth, String name) {
        this.age = age;
        this.heigth = heigth;
        this.weigth = weigth;
        this.name = name;
    }

    public Person() {
    }

    private int age;
    private int heigth;
    private int weigth;
    private String name;

    private static int compare(Person o1, Person o2) {
        return Integer.compare(o1.heigth, o2.heigth);
    }

    @Override
    public String toString() {
        return   "(" + name+
                "," + age +
                ", " + heigth +
                ", " + weigth+")";
    }

    @Override
    public int compareTo(Person o) {
        if (this.name.compareTo(o.name) == 0) {
            if (this.age > (o.age)) return 1;
            else if (this.weigth == (o.age)) return 0;
            else return -1;

        }
        return this.name.compareTo(o.name);
    }

    public int compareToWeigth(Person o) {
        if (this.name.compareTo(o.name) == 0) {
            if (this.age > (o.age)) return 1;
            else if (this.weigth == (o.age)) return 0;
            else return -1;

        }
        return this.name.compareTo(o.name);
    }

    public static void main(String[] args) {
        ArrayList<Person> humans = new ArrayList<>();
        humans.add(new Person(18,167,56,"olga"));
        humans.add(new Person(25,182,89,"oleg"));
        humans.add(new Person(16,156,47,"anna"));
        humans.add(new Person(37,167,65,"igor"));
        humans.add(new Person(42,190,73,"vlad"));
        //Collections.sort(humans);
        //humans.sort(Person::compare);
        System.out.println(humans);
    }

}
