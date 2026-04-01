package Arrays;

import java.util.ArrayList;
import java.util.List;

/*
Find the smallest and second smallest elements in an array
Given an array arr[] of integers, find the smallest and second smallest distinct elements in the array. The result should be returned in ascending order, meaning the smallest element should come first, followed by the second smallest. If there is no valid second smallest (i.e., all elements are the same or the array has fewer than two elements), then return -1.
Examples:

Input: arr[] = [12, 25, 8, 55, 10, 33, 17, 11]
Output: [8, 10]
Explanation: The smallest element is 1 and second smallest element is 10.

Input: arr[] = [2, 4, 3, 5, 6]
Output: [2, 3]
Explanation: 2 and 3 are respectively the smallest and second smallest elements in the array.

Input: arr[] = [1, 1, 1]
Output: [-1]
Explanation: Only element is 1 which is smallest, so there is no second smallest element.
*/
public class Array8 {
    static List<Integer> smallAndSecSmall(int[] arr){
        int small = Integer.MAX_VALUE;
        int sec_small = Integer.MIN_VALUE;

        for(int num : arr){
            if(num < small){
                sec_small = small;
                small = num;
            }else if(num < sec_small && num != small){
                sec_small = num;
            }
        }

        if(sec_small == Integer.MAX_VALUE){
            List<Integer> result = new ArrayList<>();
            result.add(-1);
            return result;
        }

        List<Integer> result = new ArrayList<>();
        result.add(small);
        result.add(sec_small);
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {12, 25, 8, 55, 10, 33, 17, 11};
        List<Integer> result = smallAndSecSmall(arr);
        System.out.println(result);
    }
}
