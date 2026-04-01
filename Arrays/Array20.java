package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Replace each element of Array with it's corresponding rank

Given an array arr[] of n integers, the task is to replace each element of Array with their rank in array. The rank of an element is defined as the distance between the element with the first element of the array when the array is arranged in ascending order. If two or more are same in the array then their rank is also the same as the rank of the first occurrence of the element. 

For Example: Let the given array arr[] = {2, 2, 1, 6}, then rank of elements is given by: 
sorted array is: 
arr[] = {1, 2, 2, 6} 
Rank(1) = 1 (at index 0) 
Rank(2) = 2 (at index 1) 
Rank(2) = 2 (at index 2) 
Rank(6) = 4 (at index 3)

Examples:

Input: arr[] = [100, 5, 70, 2] 
Output: [4, 2, 3, 1] 
Explanation: Rank of 2 is 1, 5 is 2, 70 is 3 and 100 is 4.

Input: arr[] = [100, 2, 70, 2] 
Output: [3, 1, 2, 1] 
Explanation: Rank of 2 is 1, 70 is 2 and 100 is 3.
*/
/*
[Efficient Approach - 1] Using Sorting - O(n * log n) time and O(n) space
The idea is to first create a sorted copy of the original array to determine the correct ranks of elements, then use a hash map to store the rank of each unique element, and finally traverse the original array to replace each element with its corresponding rank from the hash map.

Step by step approach:

Copy the input array into a new array and sort it in ascending order
Create a hash map and traverse the sorted array - for each unique element, assign it a rank (skip duplicates to keep same rank) and increment rank counter
Create a result array and traverse the original array - for each element, look up its rank in the hash map and store it at the same index in result array
Return the result array containing ranks
*/
public class Array20 {
    static int[] replaceWithRank(int[] arr){
        int n = arr.length;

        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> ranks = new HashMap<>();
        int rank = 1;

        for (int i = 0; i < n; i++) {
            if(i > 0 && sorted[i] == sorted[i - 1]) continue;

            ranks.put(sorted[i], rank++);
        }

        int[] res = new int[n];

        for(int i = 0; i < n; i++){
            res[i] = ranks.get(arr[i]);
        }

        return res;
    }
    public static void main(String[] args) {
        int[] arr = {100, 5, 70, 2};
        int[] res = replaceWithRank(arr);

        for (int val : res) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
