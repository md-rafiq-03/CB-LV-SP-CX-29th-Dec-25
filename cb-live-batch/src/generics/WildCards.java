package generics;


import polymorphism.Animal;
import polymorphism.Cat;
import polymorphism.Dog;

import java.util.ArrayList;
import java.util.List;

public class WildCards {

    public static void fun(List<? extends Animal> list){
        // read
        Animal animal = list.get(0);
        animal.sleep();

        // write not allowded
       // list.add(new Animal());
    }

    // write
    public static void fun2(List<? super Animal> list){
        // read
        Object animal = list.get(0);
        //animal.sleep();

        // write not allowded
        // list.add(new Animal());
        list.add(new Animal());
        list.add(new Dog());
    }



    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        List<Animal> cats = new ArrayList<>();
        fun(dogs);

        fun2(cats);
    }
}