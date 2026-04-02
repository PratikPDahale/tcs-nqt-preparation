package Strings;
/*
String matching where one string contains wildcard characters

Given two strings where first string may contain wild card characters and
second string is a normal string. Write a function that returns true if 
the two strings match. The following are allowed wild card characters in
first string. 

* --> Matches with 0 or more instances of any character or set of 
characters.
? --> Matches with any one character.

For example, "g*ks" matches with "geeks" match. And string "ge?ks*" 
matches with "geeksforgeeks" (note '*' at the end of first string). 
But "g*k" doesn't match with "gee" as character 'k' is not present in 
second string. 
*/
public class String21 {
    public static boolean isMatch(String pattern, String str){
        int i = 0;
        int j = 0;

        int starIndex = -1;
        int matchIndex = -1;

        while(j < str.length()){
            if(i < pattern.length() && (pattern.charAt(i) == str.charAt(j) || pattern.charAt(i) == '?')){
                i++;
                j++;
            }

            else if(i < pattern.length() && pattern.charAt(i) == '*'){
                starIndex = i;
                matchIndex = j;
                i++;
            }

            else if(starIndex != -1){
                i = starIndex + 1;
                matchIndex++;
                j = matchIndex;
            }

            else {
                return false;
            }
        }

        while(i < pattern.length() && pattern.charAt(i) == '*'){
            i++;
        }

        return i == pattern.length();
    }
    public static void main(String[] args) {
        System.out.println(isMatch("g*ks", "geeks")); // true
        System.out.println(isMatch("ge?ks*", "geeksforgeeks")); // true
        System.out.println(isMatch("g*k", "gee")); // false   
    }
}
