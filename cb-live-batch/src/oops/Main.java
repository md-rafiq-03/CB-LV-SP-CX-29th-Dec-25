package oops;

public class Main {

    public static void main(String[] args) throws Exception {
        // made an object of student
        Student s1 = new Student();
        s1.introduce();
        // assign
        s1.name = "Trump";
        s1.age = 60;
        // update
//        s1.name = "Modi Ji";
        s1.introduce();

        Student s2 = new Student();
        s2.name = "Kaju";
        s2.age = 1;
        s2.introduce();

        // s1 student wants to say hii to Elon musk
        String name2 = "Katli";
        s2.sayHii(name2);
        System.out.println(s2.checkPalindrome());

        Student.mentorName = "Neelam";
        System.out.println(Student.mentorName);


        //Test.print();
        Test.Subjects subjects = new Test.Subjects();

        Test test1 = new Test(33);
        test1.print();

        Test test2 = new Test(45);
        test2.print();

        Test test3 = new Test();

        Test test4 = new Test(95, "trump");

        Test test5 = new Test("trump");

        Test test6 = new Test(45);
        test6.setAge(20);
        test6.setName("Trump");
        System.out.println(test6.getResult());
        System.out.println(test6.getName());
        System.out.println(test6.getAge());


    }
}
