package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Mean and Median of an Array

Given an array arr[] of positive integers, find the Mean and Median, and return the floor of both values.

Note: Mean is the average of all elements in the array and Median is the middle value when the array is sorted, if the number of elements is even, it's the average of the two middle values.

Examples: 

Input: arr[] = [1, 2, 19, 28, 5]
Output: 11 5
Explanation: Sorted array - [1, 2, 5, 19, 28], Mean = (1 + 2 + 19 + 28 + 5) / 5 = 55 / 5 = 11, Median = Middle element = 5

Input: arr[] = [2, 8, 3, 4]
Output: 4 3
Explanation: Sorted array - [2, 3, 4, 8], Mean = (2 + 3 + 4 + 8) / 4 = 17 / 4 = 4.25, so floor(4.25) is 4, Median = (3 + 4)/2 = 3.5, so floor(3.5) is 3
*/
public class Array7 {
    static List<Integer> meanAndMedian(int[] arr){
        int n = arr.length;
        List<Integer> result = new ArrayList<>();
        int totalSum = 0;
        int median;

        for (int num : arr) {
            totalSum += num;
        }

        int mean = totalSum / n;

        Arrays.sort(arr);

        if(n % 2 == 0){
            median = (arr[n / 2] + arr[n / 2 - 1]) / 2;
        }else{
            median = arr[n / 2];
        }
        result.add(mean);
        result.add(median);

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 19, 28, 5};
        List<Integer> result = meanAndMedian(arr);
        System.out.println(result);
    }
}
