package abstraction;


public class Cat extends Animal {

    public Cat(){
        super("tomm", 13);
    }

    @Override
    public void sayHello() {
        System.out.println("Meoww...");
    }
}
