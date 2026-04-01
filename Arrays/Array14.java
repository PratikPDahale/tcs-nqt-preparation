package Arrays;
/*
Remove duplicates from Sorted Array

Given a sorted array arr[] of size n, the goal is to rearrange the array so that all distinct elements appear at the beginning in sorted order. Additionally, return the length of this distinct sorted subarray.

Note: The elements after the distinct ones can be in any order and hold any value, as they don't affect the result.

Examples:
Input: arr[] = [2, 2, 2, 2, 2]
Output: [2]
Explanation: All the elements are 2, So only keep one instance of 2.

Input: arr[] = [1, 2, 2, 3, 4, 4, 4, 5, 5]
Output: [1, 2, 3, 4, 5]

Input: arr[] = [1, 2, 3]
Output: [1, 2, 3]
Explanation : No change as all elements are distinct.
*/

/*
Expected Approach - O(n) Time and O(1) Space
Since the array is sorted, we do not need to maintain a hash set. All occurrences of an element would be consecutive. So we mainly need to check if the current element is same as the previous element or not. 

Step by step implementation:

Start with idx = 1 (idx is going to hold the index of the next distinct item. Since there is nothing before the first item, we consider it as the first distinct item and begin idx with 1.
Loop through the array for i = 0 to n-1.
At each index i, if arr[i] is different from arr[i-1], assign arr[idx] = arr[i] and increment idx.
After the loop, arr[] contains the unique elements in the first idx positions.
*/
public class Array14 {
    static int removeDuplicates(int[] arr){
        int n = arr.length;
        if(n <= 1)  return n;

        int idx = 1;

        for(int i = 1; i < n; i++){
            if(arr[i] != arr[i - 1])
                arr[idx++] = arr[i];
        }

        return idx;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int idx = removeDuplicates(arr);

        for(int i = 0; i < idx; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
