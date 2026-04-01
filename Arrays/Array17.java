package Arrays;
/*
Program for average of an array (Iterative and Recursive)

Given an array, the task is to find average of that array. Average is the sum of array elements divided by the number of elements.

Examples : 

Input : arr[] = {1, 2, 3, 4, 5}
Output : 3
Sum of the elements is 1+2+3+4+5 = 15 
and total number of elements is 5.
So average is 15/5 = 3

Input : arr[] = {5, 3, 6, 7, 5, 3}
Output : 4.83333
Sum of the elements is 5+3+6+7+5+3 = 29
and total number of elements is 6.
So average is 29/6 = 4.83333.
*/
public class Array17 {
    static double average(int[] arr, int n){
        int sum = 0;

        for(int i = 0; i < n; i++)
            sum += arr[i];

        return (double) sum / n;
    }
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;

        System.out.println(average(arr, n));
    }
}
