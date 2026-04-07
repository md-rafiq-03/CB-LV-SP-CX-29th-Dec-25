package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Test {

    private static void m() throws  Exception{
        throw  new InvalidNameException("Name is invalid !!");
    }

    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(10,20));
        System.out.println(calculator.add(10.0, 20.0));
        System.out.println(calculator.add(10, 20, 30));

        Animal animal = new Animal();
        animal.sayHello();

        Animal cat = new Cat(); //(upcasting)
        cat.sayHello();
        cat.sleep();

        float a = 10.2f;
        int x = (int) a;
        System.out.println(x);


        Cat myCat =(Cat) cat; // (Downcasting)

        Animal dog = new Dog();
        dog.sayHello();


        List<Animal> list = new ArrayList<>();
        list.add(new Cat());
        list.add(new Dog());
        for(int i=0;i<list.size();i++){
            list.get(i).sayHello();
        }


        HelloGame helloGame = new HelloGame(new Dog());
        helloGame.speak();

        // stream apis
        // functional interface
        // singleton classes
        // Immutable Classes
        // MultiThreading

        List<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        Exception exception = new Exception();
        m();

    }
}
