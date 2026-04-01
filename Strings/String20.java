package Strings;
/*
Count common subsequence in two strings

Given two string S and T. The task is to count the number of the common 
subsequence in S and T.

Examples:

Input : S = "ajblqcpdz", T = "aefcnbtdi" 
Output : 11 
Common subsequences are : { "a", "b", "c", "d", "ab", "bd", "ad", 
                            "ac", "cd", "abd", "acd" }

Input : S = "a", T = "ab" 
Output : 1
*/
public class String20 {
    static final int MOD = 1000000007;

    public static int countCommonSubSeq(String S, String T){
        int n = S.length();
        int m = T.length();

        long[][] dp = new long[n + 1][m + 1];

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(S.charAt(i - 1) == T.charAt(j - 1)){
                    dp[i][j] = (1 + dp[i - 1][j] + dp[i][j - 1]) % MOD;
                } else{
                    dp[i][j] = (dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1]) % MOD;

                    if(dp[i][j] < 0){
                        dp[i][j] += MOD;
                    }
                }
            }
        }
        return (int) dp[n][m];
    }

    public static void main(String[] args) {
        String S = "ajblqcpdz";
        String T = "aefcnbtdi";

        System.out.println(countCommonSubSeq(S, T));
    }
}
