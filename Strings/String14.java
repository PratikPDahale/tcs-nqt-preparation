package Strings;
/*
Count words in a given string

Given a string, count the number of words in it. 
The words are separated by the following characters: space (' ') or 
new line ('\n') or tab ('\t') or a combination of these.
*/
/*
Method : using String.split() method

Get the string to count the total number of words.
Check if the string is empty or null then return 0.
Use split() method of String class to split the string on whitespaces.
The split() method breaks the given string around matches of the given 
regular expression and returns an array of string.
The length of the array is the number of words in the given string.
Now, print the result.

*/
public class String14 {
    static int countWords(String str){
        if(str == null || str.isEmpty())    return 0;

        String[] words = str.split("\\s+");

        return words.length;
    }

    public static void main(String[] args) {
        String str = "abc\\p\"";

        System.out.println("No of words : " + countWords(str));
    }
}
