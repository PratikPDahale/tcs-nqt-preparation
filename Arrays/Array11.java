package Arrays;

import java.util.HashMap;
import java.util.Map;

/*
Counting frequencies of array elements

Given an array arr[] of non-negative integers which may contain duplicate elements. Return the frequency of each distinct element present in the array.

Examples: 

Input:  arr[] = [10, 20, 10, 5, 20]
Output: [[5, 1], [10, 2], [20, 2]]
Explanation: Here 5 occurs once, 10 occurs 2 times and 20 occurs 2 times.

Input: arr[] = [10, 20, 20]
Output: [[10, 1], [20, 2]] 
Explanation: Here 10 occurs 1 time, 20 occurs 2 times.
*/
public class Array11 {
    static Map<Integer, Integer> countFreq(int[] arr){
        Map<Integer, Integer> result = new HashMap<>();

        for(int num : arr){
            if(result.containsKey(num)){
                result.put(num, result.get(num) + 1);
            }else{
                result.put(num, 1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 5, 20};
        System.out.println(countFreq(arr));
    }
}
