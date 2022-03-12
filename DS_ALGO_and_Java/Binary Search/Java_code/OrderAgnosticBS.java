import java.util.*;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target number");
        int target = sc.nextInt();
        int[] arr = {1,2,3,4,5,6,7,8,9,12,14,15,17,65,78,99,102,103};
        System.out.println(orderAgnosticBinarySearch(arr, target));

    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (arr[start] > arr[end]) { // if descending
            while (start <= end) {
                int mid = start + (end - start)/2;
                if (target == arr[mid])
                    return mid;
                else if (target < arr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        } else {
            while (start <= end) {
                int mid = start + (end - start)/2;
                if (target == arr[mid])
                    return mid;
                else if (target > arr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }
}
