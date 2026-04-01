package Arrays;
/*
Program to find sum of elements in a given array
Given an array of integers, find the sum of its elements.

Examples:

Input : arr[] = {1, 2, 3}
Output : 6
Explanation: 1 + 2 + 3 = 6

Input : arr[] = {15, 12, 13, 10}
Output : 50
*/
public class Array13 {
    static int sum(int[] arr, int n){
        if(n <= 0)  return 0;

        return sum(arr, n - 1) + arr[n - 1];

    }
    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 15};
        System.out.println(sum(arr, arr.length));
    }
}
