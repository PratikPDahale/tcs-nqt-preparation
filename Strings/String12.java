package Strings;
/*
Sort string of characters

Given a string of lowercase characters from 'a' - 'z'. 
We need to write a program to print the characters of this string 
in sorted order.

Examples: 

Input : "dcab" 
Output : "abcd"

Input : "geeksforgeeks"
Output : "eeeefggkkorss"
*/
public class String12 {
    static void sortString(String s){
        int[] charCount = new int[26];

        for(int i = 0; i < s.length(); i++){
            charCount[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < charCount.length; i++){
            for(int j = 0; j < charCount[i]; j++){
                System.out.print((char) ('a' + i));
            }
        }
    } 
    public static void main(String[] args) {
        String s = "geeksforgeeks";

        sortString(s);
    }
}
