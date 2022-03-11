public class wrappereg {
    public static void main(String[]args) {
        int a = 10;
        // you can do the same thing as 
        Integer num = 45; // the difference that it is now created as an object, not as a primitive variable like in line 4 "a".
        // they convert a primitive into an object

        // eg if you pass a primitive variable's value to a function, in java there is only
        // pass by value, so it won't affect the original variable's value. Instead if you pass
        // the object, the reference value is passed.
        //therefore
        Integer n1 = 10; //objects
        Integer n2 = 20; //objects

        // but still the value of original values of the object variables will not change even if you modify it using another function
        // eg swap function, but the n1 and n2 here will still won't swap.
        // If you take a look what an Integer class is, it is a "final class".
        System.out.println(n1+" "+n2);

        // the final keyword; a final variable must always be initialized while declaring it.
        // this immutability only holds for the primitive datatypes
        final int bonus = 2;
        // bonus = 3; // will give an error as we cannot modify it.
        // System.out.println(bonus);

        /*
            eg. if you use final keyword for object instances like
            final Student student1 = new Student();
            , you can change the value in the object like you can change values of 
            the object.name, object.rollnumber, etc of your defined class, but you cannot
            reassign the instance. Like you cannot do this:
            student1 = student2; where student2 is another object
        */
        final A adi = new A("Aditya Singh");
        adi.name = "Aditya"; // allowed
        // adi = new A("Anu"); //not allowed
        System.out.println(adi.name);


        ///////////// finalize
        // it is a sort of a destructor, which performs certain functions which is described by you
        // manually when java decides to destroy the object by garbage collecting automatically

        A obj;
        for (int i=0; i<1000000; i++) {
            obj = new A("Adi"); // garbage collection happens automatically and the previous objects will be deleted by java using the garbage collection.
        }
    }
    static void swap(Integer a, Integer b) {
        int temp = a;
        a = b;
        b = temp;
    }
    
}

class A {
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }

    // whenever any object of class A is free or getting destroyed this finalized method will be called
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}