public class WrapperClasses {

    public static void main(String[] args) {
        // unboxing
        Integer a1 = 10;
        int a2 = a1; // unboxing // wrapper -> primitve
        //int a2 = a1.intValue(); //primitive value
        System.out.println(a1);
        System.out.println(a2);

        // Autoboxing // primtive -> wrapper
        int a3 = 100;
        Integer a4 = 200;
        a4 = Integer.valueOf(a3);
        a4=a3;

        // long -> Long
        long l0 = 10;
        Long l1 = 10L;

        Long l2=null;
        Integer i1=null;
        Boolean b1 = null;

        Integer x1 = 120;
        Integer x2 = 120;
        Integer x3 = 220;
        Integer x4 = 220;
        Integer x5 = new Integer(120);
        Integer x6 = new Integer(120);
        System.out.println(x1==x2); // address comparison
        // output -> true/false
        System.out.println(x3==x4);

        System.out.println(x5==x6);
    }
}
