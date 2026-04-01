package Strings;
/*
Check if a string is substring of another

Given two strings txt and pat, the task is to find if pat is a substring of txt. 
If yes, return the index of the first occurrence, else return -1.

Examples : 

Input: txt = "geeksforgeeks", pat = "eks"
Output: 2
Explanation: String "eks" is present at index 2 and 10, so 2 is the smallest index.

Input: txt = "geeksforgeeks", pat = "xyz"
Output: -1.
Explanation: There is no occurrence of "xyz" in "geeksforgeeks"
*/
public class String17 {
    static int strStr(String text, String pattern){
        int n = text.length();
        int m = pattern.length();

        int[] lps = buildLPS(pattern);
        
        int i = 0;
        int j = 0;
        
        while(i < n){
            if(text.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
            }

            if(j == m) return i - j;

            else if(i < n && text.charAt(i) != pattern.charAt(j)){
                if(j != 0)  j = lps[j - 1];

                else
                    i++;
            }
        }
        return -1;
    }

    private static int[] buildLPS(String pattern){
        int m = pattern.length();
        int[] lps = new int[m];

        int len = 0;
        int i = 1;

        while(i < m){
            if(pattern.charAt(i) == pattern.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len != 0){
                    len = lps[len - 1];
                }else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public static void main(String[] args) {
        String txt = "AAAAAB";
        String pat = "AAAB";

        int result = strStr(txt, pat);

        if(result != -1)
            System.out.println("Pattern found at index: " + result);
        else
            System.out.println("Pattern not found");
    }
}
