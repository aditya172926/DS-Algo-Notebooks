public class shadowing {
    static int x=90; // this variable will be available to everything inside this block; kinda like a global variable
    //static keyword is used to make it an object independent variable.
    public static void main(String[] args) {
        System.out.println(x); //90
        int x = 40;
        System.out.println(x); //40
        // the varible with the higher lovel scope will be hidden; the the x in line 2 will be overridden in the scope where the new variable 
        // with the same name x is initialized.
        fun();
        // shadowing 

    }
    static void fun() {
        System.out.println(x); //90
        // this x is not shadowed as it is outside scope of x in the line 6.
    }
}
