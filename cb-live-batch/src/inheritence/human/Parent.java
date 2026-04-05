package inheritence.human;

public class Parent extends GrandParent{
    public String eyeColor;

    public Parent(){
        super();
        System.out.println("Parent Constructor !!");
        this.eyeColor="green";
    }

    public Parent(String name, int age){
        super(name, age);
        System.out.println("Parent Parameterized Constructor !!");
    }

    public void salary(){
        System.out.println("salary....");
    }

}
