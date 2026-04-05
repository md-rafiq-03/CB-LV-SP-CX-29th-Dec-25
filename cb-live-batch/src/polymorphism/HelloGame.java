package polymorphism;

public class HelloGame {
    private final Animal animal;

    public HelloGame(Animal animal){
        this.animal = animal;
    }

    public void speak(){
        animal.sayHello();
    }
}
