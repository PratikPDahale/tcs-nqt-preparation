package Arrays;
/*
Maximum Product Subarray

Given an array arr[] consisting of positive, negative, and zero values, find the maximum product that can be obtained from any contiguous subarray of arr[].

Examples:

Input: arr[] = [-2, 6, -3, -10, 0, 2]
Output: 180
Explanation: The subarray with maximum product is [6, -3, -10] with product = 6 * (-3) * (-10) = 180.

Input: arr[] = [-1, -3, -10, 0, 6]
Output: 30
Explanation: The subarray with maximum product is [-3, -10] with product = (-3) * (-10) = 30.

Input: arr[] = [2, 3, 4] 
Output: 24 
Explanation: For an array with all positive elements, the result is product of all elements. 
*/
public class Array23 {
    public static int maxProduct(int[] nums){
        int n = nums.length;
        int leftProduct = 1;
        int rightProduct = 1;
        int ans = nums[0];

        for(int i = 0; i < n; i++){
            leftProduct = leftProduct == 0 ? 1 : leftProduct;
            rightProduct = rightProduct == 0 ? 1 : rightProduct;

            leftProduct *= nums[i];

            rightProduct *= nums[n - 1 - i];

            ans = Math.max(ans, Math.max(leftProduct, rightProduct));
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4};
        System.out.println(maxProduct(arr));
    }
}
