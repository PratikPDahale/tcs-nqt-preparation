package Strings;

import java.util.HashMap;
import java.util.Map;

/*
Count Distinct Subsequences

Given a string str, Find the number of distinct subsequences 
that can be formed from it.
A subsequence is a sequence derived from the original string 
by deleting zero or more characters without changing the relative order 
of the remaining characters.

Note: Answer can be very large, so, ouput will be answer modulo 109+7.

Examples: 

Input: str = "gfg"
Output: 7
Explanation: The seven distinct subsequences are "", "g", "f", "gf", "fg", "gg" and "gfg" 

Input: str = "ggg"
Output: 4
Explanation: The four distinct subsequences are "", "g", "gg" and "ggg"
*/
/*
Algorithm to count distinct subsequences:
1. Initialize total = 1
   -> Represents the empty subsequence ""
2. Create a HashMap lastContribution
   -> Stores contribution of each character from its last occurrence
3. Traverse each character ch in the string:
   a) Double the current total:
      newTotal = 2 * total
      -> Each subsequence can either include or exclude current character
   b) If ch has appeared before:
      -> It creates duplicate subsequences
      -> Remove duplicates:
      newTotal = newTotal - lastContribution.get(ch)
   c) Add MOD and take modulo to avoid negative values:
      newTotal = (newTotal + MOD) % MOD
   d) Store current total as last contribution of ch:
      lastContribution.put(ch, total)
   e) Update total:
      total = newTotal
4. Return total as the final answer
Time Complexity: O(n)
Space Complexity: O(n) (for hashmap)
*/
public class String19 {
    static final int MOD = 1000000007;

    public static int distinctSubSeq(String str){
        long total = 1;

        Map<Character, Long> lastContribution = new HashMap<>();
        
        for(char ch : str.toCharArray()){
            long newTotal = (2 * total) % MOD;

            if(lastContribution.containsKey(ch)){
                newTotal = (newTotal - lastContribution.get(ch) + MOD) % MOD;
            }

            lastContribution.put(ch, total);
            total = newTotal;
        }

        return (int) total;
    }
    public static void main(String[] args) {
        String str = "gfg";
        System.out.println(distinctSubSeq(str));
    }
}
