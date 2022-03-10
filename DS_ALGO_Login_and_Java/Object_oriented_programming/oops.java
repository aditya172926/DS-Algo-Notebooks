import java.lang.reflect.Array;
import java.util.*;

public class oops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        // variables of 5 students
        Student[] student = new Student[5];
        for (i=0; i<5; i++) {
            System.out.print(student[i]);
        }
        System.out.print(Arrays.toString(student));
        Student student1 = new Student(); // Student() is a constructor
        // it defines what happened when your object will be created
        // student1.name = "ADITYA";
        // student1.sex = "male";
        System.out.println(student1.rol);
        System.out.println(student1.name);
        System.out.println(student1.sex);
        student1.fun();

        ////////////// overriding the constructor
        // if you call the constructor without any parameters then it will call the default one or the one defined without any parameters
        // we can make multiple constructors in a class, called constructor overloading like the method overloading using different parametres.
        Student student2 = new Student(24, "Anupama", "Female");
        System.out.println(student2.rol);
        System.out.println(student2.name);
        System.out.println(student2.sex);
        student2.fun();

        // 2 reference variables pointing to 1 same objects. so if you modify one variable, the value of other also changes
        Student one = new Student();
        Student two = one;
        one.name = "Aditya Singh";
        System.out.println(two.name);
    }
    // create a class to store rol, name, gender of students
}
class Student {
    int rol=9;
    String name, sex;
    void fun() {
        System.out.println(this.rol);
    }
    Student() {
        // this is the constructor, 
        // this.rol = 21;
        // this.name = "Aditya";
        // this.sex = "male";

        // this is how you call a constructor from another constructor
        this (16, "default_person", "default_gender");
    }
    // constructor overriding
    // making multiple constructors
    Student(int rol, String name, String gender){
        this.rol = rol;
        this.name = name;
        this.sex = gender;
    }
}