package Arrays;
/*
House Robber

Given an array arr[] where each element shows the amount of money in a row of houses built in a line. A robber wants to steal money, but cannot rob two houses adjacent to each other because it will set off an alarm.
Find the maximum money the robber can steal without robbing two adjacent houses.

Examples: 

Input: arr[] = [6, 7, 1, 3, 8, 2, 4]
Output: 19
Explanation: The thief will steal from house 1, 3, 5 and 7, total money = 6 + 1 + 8 + 4 = 19.

Input: arr[] = [5, 3, 4, 11, 2]
Output: 16
Explanation: Thief will steal from house 1 and 4, total money = 5 + 11 = 16.
*/
/*
[Expected Approach 2] Space-Optimized DP - O(n) Time and O(1) Space
On observing the dp[] array in the previous approach, it can be seen that the answer at the current index depends only on the last two values. In other words, dp[i] depends only on dp[i - 1] and dp[i - 2]. So, instead of storing the result in an array, 
we can simply use two variables to store the last and second last result.
*/
public class Array19 {
    static int findMaxSum(int[] arr){
        int n = arr.length;

        if(n == 0)  return 0;

        if(n == 1)  return arr[0];

        int secondLast = 0, last = arr[0];

        int res = 0;
        for (int i = 1; i < n; i++) {
            res = Math.max(arr[i] + secondLast, last);
            secondLast = last;
            last = res;
        }
        return res;
    }

/*
[Expected Approach 1] Using Tabulation - O(n) Time and O(n) Space
In this approach, we build the solution iteratively from the ground up, starting with the smallest subproblems. We first define the base cases, and then gradually compute the answers for larger problems using the results of previously solved smaller ones.

Here, we create a dp[] array where dp[i] represents the maximum amount of money that can be stolen from the first i houses.

Initially,

we set dp[0] = 0 because if there are no houses, no money can be stolen.
we set dp[1] = arr[0] because if there is only one house, the thief will steal from that house.
Then, we iterate through the remaining houses and fill the dp[] array using this formula:

if the thief decides to rob the current house (i), then they must skip the previous house (i−1) in that case- arr[i] + dp[i−2].
If the thief skips the current house, then the total will simply be the maximum money till the previous house → dp[i−1].
so the answer will be the maximum of both dp[i]=max(arr[i]+dp[i−2], dp[i−1])
*/

    static int findMaxSum2(int[] arr){
        int n = arr.length;

        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = arr[0];

        for(int i = 2; i <= n; i++){
            dp[i] = Math.max(arr[i - 1] + dp[i - 2], dp[i - 1]);
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int[] arr = {6, 7, 1, 3, 8, 2, 4};
        System.out.println(findMaxSum(arr));
        System.out.println(findMaxSum2(arr));
    }
}

