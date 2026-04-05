package polymorphism;

public class Calculator {
    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public int add(int a, int b, int c, int d){
        return a+b+c+d;
    }

    public double add(double a, double b){
        return a + b;
    }

    public String add(int a, String b){
        return b+a;
    }

    public String add(String a, int b){
        return b+a;
    }

}
