import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6,7,8,9,12,14,15,17,65,78,99,102,103};
        System.out.print("Enter the target element - ");
        int target = sc.nextInt();
        System.out.print(binarySearch(arr, target));
    }    

    // return the index
    // return -1 if target is not in array
    static int binarySearch(int [] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            // find the middle element
            // int mid = (start + end)/2;
            // as integer has a fixed size, so it might be possible that the value of mid exceeds the range of integer
            // better way to do this is
            int mid = start + (end - start)/2;
            if (target == arr[mid])
                // check if the middle element is the answer
                return mid;
            else if (target > arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
