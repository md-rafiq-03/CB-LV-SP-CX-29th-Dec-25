package oops;

public class Test {
    private int result;
    private String name;
    private int age;

    // Constructors
    // default
    public Test(){
        this(100);
        System.out.println("default constructor called !!");
    }

    //parameterized constructor
    public Test(int result){
        this(100, "name");
        this.result = result;
    }

    public Test(String name){
        this.name = name;
    }

    public Test(int result, String name){
        this.result= result;
        this.name = name;
    }

    // getters and setters
    public String getName() {
        // authorized
        return name;
    }

    public void setName(String name) throws Exception {
        if(name.isEmpty()){
            throw new Exception("Name can't be Empty");
        }
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) throws Exception {
        if(age<18){
            throw new Exception("Under age");
        }
        this.age = age;
    }

    public int getResult(){
        return this.result;
    }

    public void setResult(int result){
        this.result = result;
    }


//    public static void print(){
//       // System.out.println(result);
//        Test t = new Test();
//        System.out.println(t.result);
//    }

    public void print(){
        System.out.println(this.result);
    }

    public static class Subjects{

    }

}
