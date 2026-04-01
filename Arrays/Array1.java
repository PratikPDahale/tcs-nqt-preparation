package Arrays;

import java.util.HashMap;
import java.util.Map;
/*
Find first non-repeating element in a given Array of integers 

Given an array of integers of size N, the task is to find the first non-repeating element in this array. 

Examples:

Input: {-1, 2, -1, 3, 0}
Output: 2
Explanation: The first number that does not repeat is : 2



Input: {9, 4, 9, 6, 7, 4}
Output: 6
*/

/*
Approach : 
This approach is based on the following idea:

The idea is to store the frequency of every element in the hashmap.
Then check the first element whose frequency is 1 in the hashmap.
This can be achieved using hashing 
*/
public class Array1 {
    static int firstNonRepeating(int[] arr, int n){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }

        for(int i = 0; i < n; i++){
            if(map.get(arr[i]) == 1)    return arr[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 4, 9, 6, 7, 4 };
        int n = arr.length;
        System.out.println(firstNonRepeating(arr, n));
    }
}
