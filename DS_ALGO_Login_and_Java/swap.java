import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        // simple swap method
        // int a, b;
        // a = 10;
        // b = 20;
        // int temp=a;
        // a = b;
        // b=temp;
        // System.out.print(a+" "+b);
        System.out.println(swap1(10, 20)); // here the value of the reference variable is passed not the
        // a copy of the "a" is passed to the function parameter. There is no concept of passing by reference in java only pass by value
        change(arr); // this function will change the value in the original variable as well as both the references in the main fn. and in change fn. are pointing to the same objects {1,2,3,4,5,6,7,8}
        System.out.println(Arrays.toString(arr));
    }
    // using functions: this will not change the original a and b
    static int swap1(int a, int b) {
        int temp=a;
        a = b;
        b=temp;
        System.out.print(a+" "+b);
        return a;
    }
    static void change(int [] nums) {
        nums[0]=99;
    }
}
