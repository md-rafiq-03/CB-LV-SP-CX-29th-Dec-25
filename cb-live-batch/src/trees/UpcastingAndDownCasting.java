package trees;


public class UpcastingAndDownCasting {

    public static void main(String[] args) {
        // upcasting
        Dog dog1 = new Dog();
        Animal a = dog1;

        // downcasting

//        long l = 100L;
//        int x = (int)l;

        Animal animal = new Dog();
        Dog dog2 = (Dog) animal;
    }
}
