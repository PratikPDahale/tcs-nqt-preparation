package Arrays;
/*
Array after k Rotations

Given an array arr[] and an integer k, rotate the array in place k times to the right (clockwise). In each rotation, the last element moves to the front, and all other elements shift one position to the right. Modify the array in place, do not return anything.

Examples : 

Input: arr[] = [1, 2, 3, 4, 5, 6], k = 2
Output: [5, 6, 1, 2, 3, 4]
Explanation:
=> We perform 2 right rotations (since k = 2):

After 1st rotation: Last element moves to front → [6, 1, 2, 3, 4, 5]
After 2nd rotation: Again, last element to front → [5, 6, 1, 2, 3, 4]
Input: arr[] = [1, 2, 3, 4, 5], k = 4
Output: [2, 3, 4, 5, 1]
Explanation:
=> We rotate the array 4 times to the right:

After 1st rotation: [5, 1, 2, 3, 4]
After 2nd rotation: [4, 5, 1, 2, 3]
After 3rd rotation: [3, 4, 5, 1, 2]
After 4th rotation: [2, 3, 4, 5, 1]
*/
public class Array4 {
    static void rotateRight(int[] arr, int k){
        int n = arr.length;
        k %= n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    static void reverse(int[] arr, int start, int end){
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        rotateRight(arr, k);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
