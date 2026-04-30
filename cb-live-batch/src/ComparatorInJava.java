import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer a, Integer b)  {
        return b-a;
    }
}

class MyComparator2 implements Comparator<Integer>{

    @Override
    public int compare(Integer a, Integer b)  {
        return b-a;
    }
}



class Student implements Comparable<Student>{
    public String name;

    public Integer age;
    public Student (String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //s1.compareTo(s2)
    // natural ordering
    @Override
    public int compareTo(Student s) {
        if(this.age.equals(s.age)){
          return this.name.compareTo(s.name);
        }
        return this.age.compareTo(s.age);
    }

}


class MyStudentComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        if (s1.age == s2.age){
            return s1.name.compareTo(s2.name);
        }

        return s1.age - s2.age;
    }
}


public class ComparatorInJava {

    public static void print(List<Student> list){
        for(Student s : list){
            System.out.println(s.toString());
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(7);
        list.add(8);

        Collections.sort(list, new MyComparator2() );

        for(Integer a : list){
            System.out.print(a+ ", ");
        }

        List<Student> students =new ArrayList<>();
        students.add(new Student("alice", 10));
        students.add(new Student("bob", 12));
        students.add(new Student("kunal", 8));
        students.add(new Student("krunal", 10));

        // sort acc to age, lexographica;
//        Collections.sort(students, ( s1,  s2) ->{
//            if (s1.age == s2.age){
//                return s1.name.compareTo(s2.name);
//            }
//
//            return s1.age - s2.age;
//        });
        Collections.sort(students);
        print(students);

    }

}
