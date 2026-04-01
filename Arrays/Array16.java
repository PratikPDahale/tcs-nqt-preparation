package Arrays;

import java.util.HashMap;

/*
Remove duplicates from unsorted array using Map data structure

Given an unsorted array of integers, print the
 array after removing the duplicate elements from it. 
We need to print distinct array elements according to their first occurrence.

Examples: 

Input : arr[] = { 1, 2, 5, 1, 7, 2, 4, 2}
Output : 1 2 5 7 4
Explanation : {1, 2} appear more than one time.
*/
/*
Approach :
Take a hash map, which will store all the elements which have appeared before.
Traverse the array.
Check if the element is present in the hash map.
If yes, continue traversing the array.
Else Print the element.
*/
public class Array16 {
    static void removeDups(int[] arr, int n){
        HashMap<Integer, Boolean> mp = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(mp.get(arr[i]) == null)  System.out.print(arr[i] + " ");

            mp.put(arr[i], true);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 1, 7, 2, 4, 2};
        int n = arr.length;
        removeDups(arr, n);
    }
}
