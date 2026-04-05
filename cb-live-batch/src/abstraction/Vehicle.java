package abstraction;

public interface Vehicle extends Engine, Chessis {
    void drive();
    void applyBrake();
    void getSpeed();
    //void playMusic();
    default void playMusic(){
        System.out.println("music....");
    }

    static void playGame(){

    }
}
