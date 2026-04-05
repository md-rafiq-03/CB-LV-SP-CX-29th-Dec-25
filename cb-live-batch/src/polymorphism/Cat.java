package polymorphism;

public class Cat extends Animal{
    @Override
    public void sayHello(){
        System.out.println("Meowww...");
    }

    @Override
    public void sleep(){
        System.out.println("zzzzz");
    }
}




