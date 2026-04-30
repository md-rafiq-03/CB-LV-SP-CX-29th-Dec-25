package trees;

public class JavaGenericsClient {
    public static void main(String[] args) {
//        Box box = new Box();
//        box.setValue(10);
//
//        Box box2 = new Box();
//        box2.setValue("hello");
//
//        System.out.println((Integer) box.getValue() + 10);

//        Object obj = 10;
//        String str = (String) obj;

        Box<Integer> box = new Box();
        box.setValue(10);
        System.out.println(box.getValue() + 10);

        Box<String> box2 = new Box<>();
        box2.setValue("hello");

        Pair<Integer, String> pair1 = new Pair<>(10, "hello");
        Pair<String , Boolean> pair2 = new Pair<>("LIke you", true);

    }
}
