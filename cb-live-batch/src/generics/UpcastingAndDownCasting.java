package generics;

import polymorphism.Animal;
import polymorphism.Cat;
import polymorphism.Dog;

public class UpcastingAndDownCasting {

    public static void main(String[] args) {
        // Upcasting
        Dog dog = new Dog();
        Animal animal = dog;

        String str = "hello";
        Object obj = str;

        // Downcasting

        long l = 100l;
        int x = (int)l;

        Animal animal2 = new Cat();
        Dog dog2 = (Dog) animal2;


    }
}
