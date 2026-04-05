package abstraction;

public class Test {
    public static void main(String[] args) {
        //Animal animal = new Animal();
        Animal obj = new Cat();
        obj.sayHello();
        System.out.println(obj.toString());

        Vehicle vehicle = new Car();
        vehicle.applyBrake();
        vehicle.playMusic();

        System.out.println(Constants.age);
        Vehicle.playGame();


    }
}
