package Arrays;

/*
Check if an Array is Sorted

Given an array arr[], check if it is sorted in ascending order or not. Equal values are allowed in an array and two consecutive equal values are considered sorted.

Examples: 

Input: arr[] = [10, 20, 30, 40, 50]
Output: true
Explanation: The given array is sorted.

Input: arr[] = [90, 80, 100, 70, 40, 30]
Output: false
Explanation: The given array is not sorted.
*/
/*
[Approach 1] Recursive approach - O(n) Time and O(n) Space
The idea behind recursive approach is check if the first two elements are in order, 
then recursively check the rest of the array. 
The base case is when the array has zero or one element, 
which is always considered sorted. 
    
Step-By-Step Approach:  
If size of array is zero or one, return true.
Check last two elements of array, if they are sorted, perform a recursive call with n-1 else, return false.
*/
public class Array15 {
    static boolean isSortedHelper(int[] arr, int n){
        if(n == 1 || n == 0)    return true;

        return arr[n - 1] >= arr[n - 2] && isSortedHelper(arr, n - 1);
    }

    static boolean isSorted(int arr[]){
        return isSortedHelper(arr, arr.length);
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(isSorted(arr));
    }
}
