package Strings;
/*
Reverse words in a string

Given a string s, find a way to reverse the order of the words in the given string.

Note: string may contain leading or trailing dots(.) or multiple trailing 
dots(.) between two words. The returned string should only have a single 
dot(.) separating the words.

Examples:

Input: s = "i.like.this.program.very.much" 
Output: much.very.program.this.like.i
Explanation: The words in the input string are reversed while maintaining 
the dots as separators, resulting in "much.very.program.this.like.i".

Input: s = ”..geeks..for.geeks.” 
Output: geeks.for.geeks

Input: s = "...home......"
Output: home
*/
public class String18 {
    static String reverseWords(String s){
        char[] chars = s.toCharArray();
        int n = chars.length;

        reverse(chars, 0, n - 1);

        int i = 0;
        for(int l = 0; l < n; l++){
            if(chars[l] != '.'){
                if(i != 0) chars[i++] = '.';

                int r = l;
                while(r < n && chars[r] != '.') chars[i++] = chars[r++];

                reverse(chars, i - (r - l), i - 1);

                l = r;
            }
        }

        return new String(chars, 0, i);
    }

    static void reverse(char[] arr, int left, int right){
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        String s = "..geeks..for.geeks";
        System.out.println(reverseWords(s));
    }
}
