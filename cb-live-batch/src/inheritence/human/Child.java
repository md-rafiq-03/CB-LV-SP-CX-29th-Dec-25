package inheritence.human;

public class Child extends Parent{
    public  final int MAX_AGE;
    public static final int PIN_CODE = 110041;

    public Child(){
        super();
        MAX_AGE= 100;
        System.out.println("Child Constructor !!");
    }

    public Child(String name, int age){
        super(name, age);
        MAX_AGE= 120;
        System.out.println("child Parameterized Constructor !!");
    }

    public void print(){
        System.out.println(super.age);
        super.salary();
    }

    public void thisUses(){
        System.out.println(super.age);
        this.print();
        super.salary();
        this.late();
        super.late();
        //super.print();
    }


}
