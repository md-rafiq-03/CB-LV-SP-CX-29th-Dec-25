package abstraction;


public abstract class Animal extends Object {
    public int age;
    public String name;

    protected Animal(String name, int age){
        this.age = age;
        this.name = name;
    }


    public abstract void sayHello();

    public void sleep(){
        System.out.println("zzzz...");
    }

    @Override
    public String toString() {
        return "[Name=" + name + ", Age=" + age + "]";
    }
}
