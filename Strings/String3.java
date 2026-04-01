package Strings;
/*
Remove spaces from a given string

Given a string, remove all spaces from the string and return it. 

Input:  "g  eeks   for ge  eeks  "
Output: "geeksforgeeks"

Input:  "abc d "
Output: "abcd"

Expected time complexity is O(n) and only one traversal of string. 

Below is a Simple Solution 
*/
public class String3 {
    static int removeSpaces(char[] str){
        int count = 0;

        for(int i = 0; i < str.length; i++){
            if(str[i] != ' ')
                str[count++] = str[i];
        }
        return count;
    }

    static String removeSpace(String str){
        str = str.replaceAll("\\s", "");
        return str;
    }

    public static void main(String[] args) {
        char[] str = "g eeks for ge eeks ".toCharArray();
        int i = removeSpaces(str);
        System.out.println(String.valueOf(str).subSequence(0, i));
        String string = "g eeks for ge eeks ";
        System.out.println(removeSpace(string));
    }
}
