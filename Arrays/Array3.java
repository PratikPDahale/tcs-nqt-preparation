package Arrays;
/*
Equilibrium Index

Given an array arr[] of size n, find an equilibrium index (if any) or -1 if no equilibrium index exists. The equilibrium index of an array is an index such that the sum of all elements at lower indexes equals the sum of all elements at higher indexes. When the index is at the start of the array, the left sum is 0, and when it's at the end, the right sum is 0.

Note: If multiple equilibrium indices exist, return the first one encountered from left to right.

Example: 
Input: arr[] = [1, 2, 0, 3]
Output: 2
Explanation: The sum on the left of index 2 is 1 + 2 = 3 and sum on the right of index 2 is 3.

Input: arr[] = [1, 1, 1, 1]
Output: -1 
Explanation: There is no equilibrium index in the array.

Input: arr[] = [-7, 1, 5, 2, -4, 3, 0]
Output: 3
Explanation: The sum on the left of index 3 is -7 + 1 + 5 = -1 and sum on the right of index 3 is -4 + 3 + 0 = -1.
*/
public class Array3 {
    static int equilibriumIndex(int[] arr){
        int totalSum = 0;

        for (int i : arr) {
            totalSum += i;
        }

        int leftSum = 0;

        for(int i = 0; i < arr.length; i++){
            int rightSum = totalSum - leftSum - arr[i];

            if(leftSum == rightSum) return i;

            leftSum += arr[i];
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(equilibriumIndex(arr));
    }
}
