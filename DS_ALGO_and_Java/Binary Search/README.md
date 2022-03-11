# Binary Search
It is implemented on a sorted array.
example => arr = [2,3,9,10,12,14,18,19]
The array should be sorted in ascending or descending order.

As for linear search the maximum number of comparisons we can make in the worst case is N -> number of elements.

How BS helps us -

example arr = [2,4,6,9,11,12,14,20,36,48]
Q) find if 36 is in the arr or not?
Ans) What BS says
1. Find the middle element of the arr, that is index 4 in arr. arr[4] = 11
2. ** Imagine you know that you have a sorted arr in ascending order.
Now the middle point 11 is smaller than target 36. So all elements on the LHS of 11 will be less than 11. (as this is a sorted array). As 36 > 11, then we will have to look at the RHS of the 11 only. No point in searching the target in LHS of 11.**
That is-> if target > mid => search in right
        -> if target < mid => search in left
In this way everytime the arr is divided into 2 parts.
3. If target = middle element then you have found the answer.

## DRY Run
arr = [2,4,6,9,11,12,14,20,36,48]