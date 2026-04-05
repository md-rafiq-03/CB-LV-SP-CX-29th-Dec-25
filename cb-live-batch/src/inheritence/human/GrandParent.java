package inheritence.human;

public class GrandParent{
    public String name;
    public int age;

    public GrandParent(){
        System.out.println("GrandParent Constructor !!");
        this.name = "abc";
        this.age = 100;
    }

    public GrandParent(String name, int age){
        System.out.println("GrandParent Parameterized Constructor !!");
        this.age = age;
        this.name = name;
    }

    public void late(){
        System.out.println("I am in RIP....");
    }
}
