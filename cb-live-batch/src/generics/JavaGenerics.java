package generics;

import abstraction.*;
import polymorphism.Animal;
import polymorphism.Dog;

public class JavaGenerics {

    public static void main(String[] args) {
        Box<Integer> boxOfInteger = new Box(10);
        Box<String> boxOfString = new Box("hello");
        Box<Boolean> boxOfBoolean = new Box(false);

        Box<Dog> dogBox = new Box<>(new Dog());
        dogBox.getValue().getName();


        int x = boxOfInteger.getValue();

        //int num = (Integer) boxOfString.getValue();
        System.out.println(boxOfInteger.getValue() + 10);
        System.out.println(boxOfBoolean.getValue());
        //System.out.println((int)boxOfBoolean.getValue() + 10);

        Pair<Integer, String> integerPair = new Pair<>(10,"hello");
        System.out.println(integerPair.first + ", " + integerPair.second);

        BoxForNumbers<Double> box = new BoxForNumbers<>(10.0);

        BoxForVehicle<Alto> boxForVehicle = new BoxForVehicle<>();
        Integer num2 = getResult(10);
        String str = getResult("hello");
        printResult(10, "hello");
        //printResult("hello", 10);
    }

//    private static Object getResult(Object result){
//        return result;
//    }

    private static <T extends Integer, U extends String> Pair<T, U> printResult(T first, U second){
        //int x = first + 10;
       // int x =Integer.sum(first ,10);
        return new Pair<>(first, second);
    }

    private static <T> T getResult(T result){
        // operation
        return result;
    }
}



class Pair<T, V> {
    public T first ;
    public V second;

    public Pair(T first, V second){
        this.first = first;
        this.second = second;
    }
}

class Box<T>{ // type paramter
    private T value;

    public Box(T value){
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }

    public void getValue(T value){
        this.value = value;
    }
}

class BoxForNumbers<T extends Number>{
    public T value;

    public BoxForNumbers(T value){
        this.value = value;
    }

    public void printNumber(){
        System.out.println(value.doubleValue());
    }
}

class BoxForAnimals<T extends Animal>{
    public T value;

    public BoxForAnimals(T value){
        this.value = value;
    }

    public void print(){
        value.sleep();
    }
}

class BoxForVehicle<T extends Car & Vehicle & Chessis & Engine>{

}