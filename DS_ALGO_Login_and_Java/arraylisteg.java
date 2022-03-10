import java.util.ArrayList;

public class arraylisteg {
    public static void main(String[] args) {
        // an ArrayList is a class.
        // an ArrayList can be used if you don't know the length of your array before hand.
        // you don't know the size of the array and let you input any number of elements.

        // syntax
        // ArrayList<wrapper_classes> variable_name = new ArrayList<>();
        // wrapper_classes are like Integer, String, etc.

        /////////////////////////
        /* in ArrayList the size is actually fixed internally.
        and when the ArrayList are filled to the certain (50%) amount, it creates a new array
        of say double the size of the the original array, then copy the previous array
        into a new array and the old one is deleted.
        */

        ArrayList<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(340);
        list.add(343);
        list.add(31);
        list.add(4);

        //we can update something as well; there are a lot more functions in ArrayList
        // checkout the java documentation for syntax and help.
        list.set(0, 99);

        // print the ArrayList
        System.out.print(list);

        // array of arraylist; each element is of type ArrayList
        ArrayList<ArrayList<Integer>> array_list = new ArrayList<>();
    }
}
