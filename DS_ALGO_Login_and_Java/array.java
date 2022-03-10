import java.util.*;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // array is the collection of datatypes it can be primitive data, objects etc.
        // syntax: datatype[] variable_name = new datatype[array_size];
        // example
        int[] nums = new int[5];
        // you can also add a object type as the datatype
        // another way
        int[] nums2 = {1,2,3,4,5,6,7,8};
        for( int i=0; i<nums2.length; i++) {
            System.out.println(nums2[i]);
        }

        // steps performed internally
        int [] nums3; // declaration of array, nums3 is getting defined in the stack; happens at the compile time
        nums3 = new int[5]; // initialization; actually here the object is being created in the memory; it happens in runtime; the new keyword is same as the dynamic memory allocation


        // an enhanced for loop
        for (int num:nums2) { // for each element in array, print the element
            System.out.print(num+" "); // here num represents an element of the array
        }

        // Another way to print
        //Arrays class with function toString()
        System.out.print(Arrays.toString(nums2));

        // 2D array
        /*
            1 2 3
            4 5 6
        */
        // syntax: datatype[num_rows][num_cols] variable_name = new datatype[num_rows][num_cols]
        int[][] arr = new int[3][3]; // it is optional to provide the number of columns, but mandatory for the number of rows

        //input
        for (int row=0; row<arr.length; row++) {    // arr.length return the number of rows
            for (int col = 0; col<arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        // display the 2d array
        for (int row=0; row<arr.length; row++) {    // arr.length return the number of rows
            for (int col = 0; col<arr[row].length; col++) { // this arr[row].length is helpful if the every column is not of the same size, can be used for printing 2d arrays where each array is not of the same size
                System.out.print(arr[row][col]+" ");
            }
            System.out.print("\n");
        }
        // another way to print 2d array
        for (int row=0; row<arr.length; row++) {    // arr.length return the number of rows
            System.out.println(Arrays.toString(arr[row]));
        }
        // another way using the enhanced for loop
        // the type of every element in 2d array is array; as 2d array are simply an array of arrays
        for (int[] a: arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
