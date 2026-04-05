package inheritence.animal;

public class Animal {
    private String name;
    private int age;
    protected String color;
    String breed;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("eating...");
    }

    public void sleep(){
        System.out.println("ZZZZZZ");
    }

    public void sayHello(){
        System.out.println(".....");
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

}
