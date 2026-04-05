package inheritence.animal;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.color);
        dog.eat();
        dog.sleep();
        dog.sayHello();

        Cat cat = new Cat();
        System.out.println(cat.getAge());
        System.out.println(cat.getName());
        cat.eat();
        cat.sayHello();
        System.out.println(cat.breed);
    }
}
