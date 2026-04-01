package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

/*
Find Character Frequencies in Order of Occurrence

Given string s containing only lowercase characters, the task is to print the 
characters along with their frequency in the order of their occurrence and 
in the given format explained in the examples below.

Examples: 

Input: s = "geeksforgeeks"
Output: g2 e4 k2 s2 f1 o1 r1

Input: str = "elephant"
Output: e2 l1 p1 h1 a1 n1 t1
*/
public class String8 {
    static void modifyString(String s){
        Map<Character, Integer> map = new LinkedHashMap<>();

        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.print(entry.getKey() + "" + entry.getValue() + " ");
        }
        
    }
    public static void main(String[] args) {
        String S = "geeksforgeeks";
        modifyString(S);
    }
}
