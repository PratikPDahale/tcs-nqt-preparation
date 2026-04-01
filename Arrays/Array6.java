package Arrays;
/*
Array Reverse

Reverse an array arr[]. Reversing an array means rearranging the elements such that the first element becomes the last, the second element becomes second last and so on.

Examples:

Input: arr[] = [1, 4, 3, 2, 6, 5]  
Output:  [5, 6, 2, 3, 4, 1]
Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.

Input: arr[] = [4, 5, 1, 2]
Output: [2, 1, 5, 4]
Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on.
*/
public class Array6 {
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        reverse(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
