package Arrays;

/*
Trapping Rain Water Problem

Given an array arr[] of size n consisting of non-negative integers, 
where each element represents the height of a bar in an elevation map 
and the width of each bar is 1, determine the total amount of water that 
can be trapped between the bars after it rains.

Examples:  

Input: arr[] = [3, 0, 1, 0, 4, 0, 2]
Output: 10
Explanation: The expected rainwater to be trapped is shown in the above image.

Input: arr[] = [3, 0, 2, 0, 4]
Output: 7
Explanation: We trap 0 + 3 + 1 + 3 + 0 = 7 units.

Input: arr[] = [1, 2, 3, 4]
Output: 0
Explanation: We cannot trap water as there is no height bound on both sides
*/

/*
[Expected Approach] Using Two Pointers - O(n) Time and O(1) Space
The approach is mainly based on the following facts:

1.If we consider a subarray arr[left...right], we can decide the amount of
 water either for arr[left] or arr[right] if we know the left max 
 (max element in arr[0...left-1]) and right max (max element in arr[right+1...n-1].
2.If left max is less than the right max, then we can decide for arr[left]
. Else we can decide for arr[right]
3.If we decide for arr[left], then the amount of water would be 
left max - arr[left] and if we decide for arr[right], then the amount of 
water would be right max - arr[right].
*/
public class Array26 {
    static int maxWater(int[] arr){
        int left = 1;
        int right = arr.length - 2;

        int lMax = arr[left - 1];
        int rMax = arr[right + 1];

        int res = 0;
        while(left <= right){
            if(rMax <= lMax){
                res += Math.max(0, rMax - arr[right]);

                rMax = Math.max(rMax, arr[right]);

                right -= 1;
            }else{
                res += Math.max(0, lMax - arr[left]);

                lMax = Math.max(lMax, arr[left]);

                left += 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 3, 1, 0, 4};
        System.out.println(maxWater(arr));
    }
}
