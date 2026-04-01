package Arrays;
/*
Largest element in an Array

Given an arr[] of elements of size n, return the largest element given in the array.

Examples:

Input: arr[] = [10, 20, 4]
Output: 20
Explanation: Among 10, 20 and 4, 20 is the largest. 

Input: arr[] = [20, 10, 20, 4, 100]
Output: 100
*/
public class Array9 {
    static int findMax(int[] arr, int i){
        if(i == arr.length - 1) return arr[i];

        int recMax = findMax(arr, i + 1);

        return Math.max(recMax, arr[i]);
    }

    static int largest(int[] arr){
        return findMax(arr, 0);
    }
    public static void main(String[] args) {
        int[] arr = {20, 10, 20, 4, 100};
        System.out.println(largest(arr));
    }
}
