package Strings;

import java.util.HashSet;

/*
Remove duplicates from a string

Given a string s which may contain lowercase and uppercase characters. 
The task is to remove all duplicate characters from the string and find the resultant string.

Note: The order of remaining characters in the output should be the same as in the original string.

Example:

Input: s = geeksforgeeks
Output: geksfor
Explanation: After removing duplicate characters such as e, k, g, s, we have string as "geksfor".

Input: s = HappyNewYear
Output: HapyNewYr
Explanation: After removing duplicate characters such as p, e, a, we have string as "HapyNewYr".
*/
public class String16 {
    //Using Hash Set - O(n) Time
    static String removeDuplicates(String s){
        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(!set.contains(ch)){
                result.append(ch);
                set.add(ch);
            }
        }
        return result.toString();
    }

    //Using Frequency Array - O(n)
    static String removeDuplicates2(String s){
        int[] ch = new int[256];
        StringBuilder ans = new StringBuilder();

        for(char c : s.toCharArray()){
            if(ch[c] == 0){
                ans.append(c);
                ch[c]++;
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(removeDuplicates(s));
        System.out.println(removeDuplicates2(s));
    }
}
