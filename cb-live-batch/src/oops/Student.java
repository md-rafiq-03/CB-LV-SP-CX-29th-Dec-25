package oops;

// access specifier
// public
// protected
// default
//
public class Student {

    // member variables
    int age;
    String name;

    static String mentorName;
    // methods

    public void introduce(){
        System.out.println("My name is: " + name + " and age is: "+ age);
    }

    public void sayHii(String name){
        // this -> refernce of current object
        // cureent -> s2.sayHii()
        // this -> s2
        System.out.println(this.name + " is saying hii to " + mentorName);
    }

    public boolean checkPalindrome(){
        // this -> s2
        // this.name
        int n = this.name.length();
        int i=0,j=n-1;
        while (i<=j){
            if(this.name.charAt(i)!=this.name.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean compareName(String name){
        int n = name.length();
        int i=0,j=n-1;
        while (i<=j){
            if(name.charAt(i)!=name.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
    public static void  sayHiiToTeacher(){
        Student student = new Student();
        System.out.println(student.name);
        student.name = "xyz";
    }

    public static class Address{
        String flatNo;
        String adressLine1;
        String adressLine2;
    }

    public  class Address2{
        String flatNo;
        String adressLine1;
        String adressLine2;
    }

}



