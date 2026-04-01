package Strings;

import java.util.HashMap;
import java.util.Map;

/*
Check if two Strings are Anagrams of each other

Given two non-empty strings s1 and s2 of lowercase letters, determine if they are anagrams — i.e., if they contain the same characters with the same frequencies.

Examples:

Input: s1 = “geeks”  s2 = “kseeg”
Output: true
Explanation: Both the string have same characters with same frequency. 
So, they are anagrams.

Input: s1 = "allergy", s2 = "allergyy"
Output: false
Explanation: Although the characters are mostly the same, s2 contains an extra 'y' 
character. Since the frequency of characters differs, 
the strings are not anagrams.

Input: s1 = "listen", s2 = "lists"
Output: false
Explanation: The characters in the two strings are not the same — 
some are missing or extra. So, they are not anagrams.
*/
public class String11 {
    static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for(char ch : s1.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(char ch : s2.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }

        for(Map.Entry<Character, Integer> pair : map.entrySet()){
            if(pair.getValue() != 0)    return false;
        }

        return true;
    }
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "lists";

        System.out.println(isAnagram(s1, s2));
    }
}
