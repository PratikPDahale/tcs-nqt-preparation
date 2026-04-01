package Strings;

import java.util.HashMap;
import java.util.Map;

/*
First non-repeating character of given string

Given a string s of lowercase English letters, the task is to find the 
first non-repeating character. If there is no such character, return '$'.

Examples: 

Input: s = "geeksforgeeks"
Output: 'f'
Explanation: 'f' is the first character in the string which does not repeat.

Input: s = "racecar"
Output: 'e'
Explanation: 'e' is the only character in the string which does not repeat.

Input: "aabbccc"
Output: '$'
Explanation: All the characters in the given string are repeating.
*/
public class String9 {
    static char nonRep(String s){
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(char ch : s.toCharArray()){
            if(map.get(ch) == 1)    return ch;
        }

        return '$';
    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(nonRep(s));
    }
}
