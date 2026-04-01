package Strings;

import java.util.HashSet;

/*
Remove characters from the first string which are present in the second string

Given two strings string1 and string2, remove those characters from the 
first string(string1) which are present in the second string(string2). 
Both strings are different and contain only lowercase characters.
NOTE: The size of the first string is always greater than the size of 
the second string( |string1| > |string2|).
*/
/*
Example:

Input:
string1 = "computer"
string2 = "cat"
Output: "ompuer"
Explanation: After removing characters(c, a, t)
from string1 we get "ompuer".

Input:
string1 = "occurrence"
string2 = "car"
Output: "ouene"
Explanation: After removing characters
(c, a, r) from string1 we get "ouene".
*/
public class String4 {
    static String removeChar(String s1, String s2){
        HashSet<Character> set = new HashSet<>();
        for(char ch : s2.toCharArray()){
            set.add(ch);
        }

        String result = "";

        for(char ch : s1.toCharArray()){
            if(!(set.contains(ch))) 
                result += ch;
            
        }

        return result;
    }
    public static void main(String[] args) {
        String s1 = "computer";
        String s2 = "cat";

        System.out.println(removeChar(s1, s2));
    }
}
